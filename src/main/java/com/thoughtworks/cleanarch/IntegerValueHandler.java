package com.thoughtworks.cleanarch;

public class IntegerValueHandler implements  ValueHandler{
    @Override
    public Object handler(String value) {
        return Integer.valueOf(value);
    }
}
