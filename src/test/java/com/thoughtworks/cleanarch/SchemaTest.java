package com.thoughtworks.cleanarch;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SchemaTest {
    @Test
    public void should_return_BOOLEAN_when_given_flag_l() {
        //given
        String expected = "BOOLEAN";
        FlagSchema flagSchemaOne = new FlagSchema("l",ValueType.BOOLEAN);
        FlagSchema flagSchemaTwo = new FlagSchema("p",ValueType.INTEGER);
        FlagSchema flagSchemaThree = new FlagSchema("d",ValueType.STRING);
        List<FlagSchema> flagSchemas = new ArrayList<>();
        flagSchemas.add(flagSchemaOne);
        flagSchemas.add(flagSchemaTwo);
        flagSchemas.add(flagSchemaThree);
        Schema schema = new Schema(flagSchemas);
        //when
        String actual = schema.getTypeOf("l");
        //then
        Assert.assertEquals(expected, actual);
    }
}