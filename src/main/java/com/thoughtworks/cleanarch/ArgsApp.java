package com.thoughtworks.cleanarch;

import java.util.List;


public class ArgsApp {
    Args parse(String inputCommand, Schema schema) throws InputErrorException, FlagRepeatException {
        Lexer lexer = new Lexer();
        ArgumentParse argumentParse = new ArgumentParse(schema);
        List<Arg> args = lexer.lexicalCheck(inputCommand);
        List<Argument> arguments = argumentParse.parse(args);
        return new Args(arguments, inputCommand);
    }
}
