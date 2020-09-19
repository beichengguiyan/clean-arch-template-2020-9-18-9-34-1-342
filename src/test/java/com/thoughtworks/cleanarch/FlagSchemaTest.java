package com.thoughtworks.cleanarch;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class FlagSchemaTest {

    @Test
    public void should_return_BOOLEAN_when_given_flag_l() {
        //given
        String expected = "BOOLEAN";
        FlagSchema flagSchema = new FlagSchema("l", ValueType.BOOLEAN);
        //when
        String actual = flagSchema.getType();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void should_return_false_when_given_flag_l() {
        //given
        Boolean expected = false;
        FlagSchema flagSchema = new FlagSchema("l", ValueType.BOOLEAN);
        //when
        Object actual = flagSchema.getDefaultValue();
        //then
        Assert.assertEquals(expected, actual);
    }

}