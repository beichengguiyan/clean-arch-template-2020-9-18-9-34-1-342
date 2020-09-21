package com.thoughtworks.cleanarch;

import java.util.ArrayList;
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

    public List<Argument> assignDefault(List<Argument> argumentsFromKeyValuePairs) {
        List<Argument> arguments = new ArrayList<>();
        for (Argument argument : argumentsFromKeyValuePairs) {
            String flag = argument.getFlag();
            Object value;
            if (argument.getValue() == null) {
                value = getDefaultValueOf(flag);
            } else {
                value = argument.getValue();
            }
            Argument argumentTemp = new Argument(flag, value);
            arguments.add(argumentTemp);
        }
        return arguments;
    }
}
