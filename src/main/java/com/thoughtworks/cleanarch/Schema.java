package com.thoughtworks.cleanarch;

import java.util.List;

public class Schema {
    private List<FlagSchema> flagSchemas;

    public Schema(List<FlagSchema> flagSchemas) {

        this.flagSchemas = flagSchemas;
    }

    public String getTypeOf(String flag) {

        for (FlagSchema flagSchema : flagSchemas) {
            if (flagSchema.getFlag().equals(flag)) {
                return flagSchema.getType();
            }
        }
        return null;
    }

    public Object getDefaultValueOf(String flag) {

        for (FlagSchema flagSchema : flagSchemas) {
            if (flagSchema.getFlag().equals(flag)) {
                return flagSchema.getDefaultValue();
            }
        }
        return null;
    }
}
