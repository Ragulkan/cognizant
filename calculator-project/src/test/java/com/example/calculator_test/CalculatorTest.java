package com.example.calculator_test;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void testAdd() {
        assertEquals(9, calculator.add(4, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(5, 4));
    }
}

