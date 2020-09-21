package com.thoughtworks.cleanarch;

public class BooleanValueHandler implements ValueHandler{
    @Override
    public Object handler(String value) {
        return Boolean.valueOf(value);
    }
}
