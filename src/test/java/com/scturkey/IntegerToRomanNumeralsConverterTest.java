package com.scturkey;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToRomanNumeralsConverterTest {


    IntegerToRomanNumeralsConverter converter;

    @Before
    public void setup(){
        converter = new IntegerToRomanNumeralsConverter();
    }

    @Test
    public void should_convert_1_2_3() {
        assertEquals("I", converter.convert(1));
        assertEquals("II", converter.convert(2));
        assertEquals("III", converter.convert(3));
    }

    @Test
    public void should_convert_5_6() {
        assertEquals("V", converter.convert(5));
        assertEquals("VI", converter.convert(6));
    }
}