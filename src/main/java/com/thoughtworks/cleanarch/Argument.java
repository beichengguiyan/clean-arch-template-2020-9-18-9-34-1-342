package com.thoughtworks.cleanarch;

public class Argument {
    private String flag;
    private Object value;

    public Argument(String flag, Object value) {
        this.flag = flag;
        this.value = value;
    }

    public String getFlag() {
        return flag;
    }

    public Object getValue() {
        return value;
    }
}
