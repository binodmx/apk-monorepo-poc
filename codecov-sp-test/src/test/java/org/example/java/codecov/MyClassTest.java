package org.example.java.codecov;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyClassTest {

    @Test
    public void testGetHello() {
        MyClass myClass = new MyClass();
        assertEquals(myClass.getHello(), "Hello");
    }
}
