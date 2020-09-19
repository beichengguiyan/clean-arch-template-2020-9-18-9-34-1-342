package com.thoughtworks.cleanarch;

import java.util.List;

public class Schema {
    private List<FlagSchema> flagSchemas;

    public Schema(List<FlagSchema> flagSchemas) {
        this.flagSchemas = flagSchemas;
    }

    public String getTypeOf(String flag) {
        return null;
    }

    public Object getDefaultValueOf(String flag) {
        return null;
    }
}
