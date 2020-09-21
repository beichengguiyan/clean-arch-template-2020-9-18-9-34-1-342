package com.thoughtworks.cleanarch;

public class ValueFactory {

    public ValueHandler create(String flagType) {
        if (flagType.equals(ValueType.BOOLEAN.getType())) {
            return new BooleanValueHandler();
        } else if (flagType.equals(ValueType.INTEGER.getType())) {
            return new IntegerValueHandler();
        } else if (flagType.equals(ValueType.STRING.getType())) {
            return new StringValueHandler();
        }
        return null;
    }
}
