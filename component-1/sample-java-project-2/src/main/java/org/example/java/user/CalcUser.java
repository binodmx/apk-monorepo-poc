package org.example.java.user;

import org.example.java.math.Calculator;

public class CalcUser {
    private final Calculator calculator = new Calculator();

    public CalcUser() {

    }

    /**
     * @return random number
     */
    public int generateRandomInt() {
        return calculator.getRandomInt();
    }
}
