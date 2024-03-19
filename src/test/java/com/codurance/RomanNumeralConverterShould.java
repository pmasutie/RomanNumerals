package com.codurance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterShould {
    @Test
    public void convert_1_to_I() {
        assertEquals("I", RomanNumeralConverter.convert(1));
    }
}