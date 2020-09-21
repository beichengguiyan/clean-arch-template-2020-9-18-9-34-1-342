package com.thoughtworks.cleanarch;

public class FlagRepeatException extends Throwable {
    public FlagRepeatException() {
        super("请不要重复输入相同的flag");
    }
}
