package org.example.java.math;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int c = calculator.add(5, 3);
        assertEquals(c, 8);
    }
}
