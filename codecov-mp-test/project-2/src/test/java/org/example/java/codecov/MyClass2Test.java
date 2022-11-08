package org.example.java.codecov;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyClass2Test {

    @Test
    public void testGetHello() {
        MyClass2 myClass2 = new MyClass2();
        assertEquals(myClass2.getHello(), "Hello");
    }
}
