package com.thoughtworks.cleanarch;

public class Arg {
    private String flag;
    private String value;
    private String type;

    public Arg(String argPair, Schema schema) {
        this.flag = flag;
        this.value = value;
        this.type = type;
    }

    public Object parseValue() {
        return null;
    }

    public Boolean withFlag(String flag) {
        return null;
    }

    public String getFlag() {
        return null;
    }
}
