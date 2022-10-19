package org.example;

import org.apache.commons.math3.random.RandomDataGenerator;

/**
 * Calculator class is used to perform simple mathematical operations
 */
public class Calculator {

    /**
     * @param a first integer
     * @param b second integer
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * @return random number between 1 and 10
     */
    public int getRandomInt() {
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        return randomDataGenerator.nextInt(1, 10);
    }
}
