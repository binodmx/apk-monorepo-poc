package org.example;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int c = calculator.add(5, 3);
        assertEquals(8, c);
    }
}
