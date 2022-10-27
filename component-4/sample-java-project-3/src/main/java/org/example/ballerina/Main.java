package org.example.ballerina;

import org.example.java.math.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Random number: " + calculator.getRandomInt());
    }
}
