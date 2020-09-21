package com.thoughtworks.cleanarch;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArgumentParse {
    private Schema schema;

    public ArgumentParse(Schema schema) {
        this.schema = schema;
    }

    List<Argument> parse(List<Arg> keyValuePairs) {
        List<Argument> argumentsFromKeyValuePairs = parseKeyValuePairs(keyValuePairs);
        List<Argument> argumentsWithDefaultValue = schema.assignDefault(argumentsFromKeyValuePairs);
        return Stream.concat(argumentsFromKeyValuePairs.stream(), argumentsWithDefaultValue.stream()).collect(Collectors.toList());
    }

    public List<Argument> parseKeyValuePairs(List<Arg> keyValuePairs) {
        List<Argument> arguments = new ArrayList<>();
        for (Arg keyValuePair : keyValuePairs) {
            String flag = keyValuePair.getFlag();
            Object value = keyValuePair.parseValue();
            Argument argument = new Argument(flag, value);
            arguments.add(argument);
        }
        return arguments;
    }

}
