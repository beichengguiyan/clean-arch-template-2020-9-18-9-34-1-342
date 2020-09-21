package com.thoughtworks.cleanarch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lexer {

    public static List<Arg> lexicalCheck(String inputCommand) throws InputErrorException, FlagRepeatException {
        if (inputCommand==null || !inputCommand.trim().substring(0,1).equals("-")) {
            throw new InputErrorException();
        }
        String[] argArray = inputCommand.substring(1).split("-");
        List<Arg> argList = new ArrayList<>();
        // 记录已经输入的flag
        Set<String> flagSet = new HashSet<>();
        for (String argString : argArray) {
            Arg arg = Arg.of(argString);
            if (flagSet.contains(arg.getFlag())) {
                throw new FlagRepeatException();
            }
            flagSet.add(arg.getFlag());
            argList.add(arg);
        }
        return argList;
    }
}
