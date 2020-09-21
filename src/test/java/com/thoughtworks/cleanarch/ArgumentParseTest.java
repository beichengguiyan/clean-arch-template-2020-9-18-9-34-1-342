package com.thoughtworks.cleanarch;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArgumentParseTest {
    @Test
    public void should_return_argument_list_when_given_Arg_list() {
        //given
        List<Argument> expected = new ArrayList<>();
        Argument argumentOne = new Argument("l",true);
        Argument argumentTwo = new Argument("p",8080);
        Argument argumentThree = new Argument("d","/usr/logs");
        expected.add(argumentOne);
        expected.add(argumentTwo);
        expected.add(argumentThree);

        List<Arg> args =new ArrayList<>();
        Arg argOne = new Arg("l","true",ValueType.BOOLEAN.getType());
        Arg argTwo = new Arg("p","8080",ValueType.INTEGER.getType());
        Arg argThree = new Arg("d","/usr/logs",ValueType.STRING.getType());
        args.add(argOne);
        args.add(argTwo);
        args.add(argThree);

        List<FlagSchema> flagSchemas = new ArrayList<>();
        FlagSchema flagSchemaOne = new FlagSchema("l",ValueType.BOOLEAN);
        FlagSchema flagSchemaTwo = new FlagSchema("p",ValueType.INTEGER);
        FlagSchema flagSchemaThree = new FlagSchema("d",ValueType.STRING);
        flagSchemas.add(flagSchemaOne);
        flagSchemas.add(flagSchemaTwo);
        flagSchemas.add(flagSchemaThree);

        Schema schema = new Schema(flagSchemas);
        ArgumentParse argumentParse = new ArgumentParse(schema);

        //when
        List<Argument> actual = argumentParse.parseKeyValuePairs(args);

        //then
        Assert.assertEquals(expected.get(0).getValue(), actual.get(0).getValue());
    }
}