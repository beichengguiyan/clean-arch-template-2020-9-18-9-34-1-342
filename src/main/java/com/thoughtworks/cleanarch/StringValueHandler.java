package com.thoughtworks.cleanarch;

public class StringValueHandler implements ValueHandler{
    @Override
    public Object handler(String value) {
        return value;
    }
}
