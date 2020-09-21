package com.thoughtworks.cleanarch;

import java.util.List;

public class Args {
    private List<Argument> argPairs;
    private String args;

    public Args(List<Argument> argPairs,String args) {
        this.argPairs = argPairs;
        this.args = args;
    }

    public Object getValueOf(String flag) {

        for (Argument arg : argPairs) {
            if (arg.getFlag().equals(flag)) {
                return arg.getValue();
            }
        }
        return null;
    }
}
