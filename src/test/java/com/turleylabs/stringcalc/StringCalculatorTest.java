package com.turleylabs.stringcalc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StringCalculatorTest {
    @Test
    public void printStringZeroWhenInputIsAnEmptyString() {
        StringCalculator stringCalculator = new StringCalculator(null, null);

        String actual = null;
        assertEquals("0", actual);
    }

    @Test
    public void printNumberAsAStringWhenStringInputIsANumber() {
        StringCalculator stringCalculator = new StringCalculator(null, null);

        String actual = null;
        assertEquals("0", actual);
    }
}