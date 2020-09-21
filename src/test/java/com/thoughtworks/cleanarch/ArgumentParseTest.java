package com.thoughtworks.cleanarch;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArgumentParseTest {
    @Test
    public void should_return_false_when_given_schema_flag_value() {
        //given
        Boolean expected = false;
        FlagSchema flagSchemaOne = new FlagSchema("l",ValueType.BOOLEAN);
        FlagSchema flagSchemaTwo = new FlagSchema("p",ValueType.INTEGER);
        FlagSchema flagSchemaThree = new FlagSchema("d",ValueType.STRING);
        List<FlagSchema> flagSchemas = new ArrayList<>();
        flagSchemas.add(flagSchemaOne);
        flagSchemas.add(flagSchemaTwo);
        flagSchemas.add(flagSchemaThree);
        Schema schema = new Schema(flagSchemas);
        ArgumentParse argumentParse = new ArgumentParse(schema);
        String flag ="l";
        String value="false";
        //when

        Object actual = argumentParse.parseValue(schema,flag,value);

        //then
        Assert.assertEquals(expected, actual);
    }

}