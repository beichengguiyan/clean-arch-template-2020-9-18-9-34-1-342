package com.thoughtworks.cleanarch;

public enum ValueType {
    BOOLEAN(false),
    INTEGER(0),
    STRING("");


    private Object defaultValue;

    ValueType(Object defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Object getDefaultValue() {
        return defaultValue;
    }

    public String getType() {
        return this.toString();
    }
}
