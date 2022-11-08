package org.example.java.codecov;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyClassTest {

    @Test
    public void testGetHello() {
        MyClass myClass = new MyClass();
        assertEquals(myClass.getHello(), "Hello");
    }
    
    @Test
    public void testGetHello2() {
        MyClass myClass = new MyClass();
        assertEquals(myClass.getHello2(), "Hello2");
    }
    
    @Test
    public void testGetHello3() {
        MyClass myClass = new MyClass();
        assertEquals(myClass.getHello3(), "Hello3");
    }
}
