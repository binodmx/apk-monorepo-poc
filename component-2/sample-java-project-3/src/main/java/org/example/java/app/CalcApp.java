package org.example.java.app;

import org.example.java.math.Calculator;

public class CalcApp {
    private final Calculator calculator = new Calculator();

    public CalcApp() {

    }

    /**
     * @return random number
     */
    public int generateRandomInt() {
        return calculator.getRandomInt();
    }
}
