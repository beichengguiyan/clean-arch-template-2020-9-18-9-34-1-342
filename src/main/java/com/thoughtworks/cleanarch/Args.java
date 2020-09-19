package com.thoughtworks.cleanarch;

import org.apache.ibatis.annotations.Arg;

import java.util.List;

public class Args {
    private List<Arg> argPairs;
    private String args;
    private Schema schema;

    public Args(String args, Schema schema) {
        this.args = args;
        this.schema = schema;
    }

    public Object getValueOf(String flag) {
        return null;
    }
}
