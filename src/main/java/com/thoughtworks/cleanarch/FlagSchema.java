package com.thoughtworks.cleanarch;

public class FlagSchema {
    private String flag;
    private ValueType valueType;

    public FlagSchema(String flag, ValueType valueType) {
        this.flag = flag;
        this.valueType = valueType;
    }

    public String getType() {
        return valueType.getType();
    }

    public Object getDefaultValue() {
        return valueType.getDefaultValue();
    }

    public String getFlag() {
        return flag;
    }
}
