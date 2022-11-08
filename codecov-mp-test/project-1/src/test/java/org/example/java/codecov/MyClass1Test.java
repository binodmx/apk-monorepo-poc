package org.example.java.codecov;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyClass1Test {

    @Test
    public void testGetHello() {
        MyClass1 myClass1 = new MyClass1();
        assertEquals(myClass1.getHello(), "Hello");
    }
}
