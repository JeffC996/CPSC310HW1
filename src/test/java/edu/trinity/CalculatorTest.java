package edu.trinity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calc1 = new Calculator();
        assertEquals(10, calc1.add(2,8));

        Calculator calc2 = new Calculator();
        assertEquals(0, calc2.add(2,-2));
    }


    @Test
    void subtract() {
        Calculator calc1 = new Calculator();
        assertEquals(-6, calc1.subtract(2,8));

        Calculator calc2 = new Calculator();
        assertEquals(0, calc2.subtract(2,2));
    }

    @Test
    void multiply() {
        Calculator calc1 = new Calculator();
        assertEquals(16, calc1.multiply(2,8));

        Calculator calc2 = new Calculator();
        assertEquals(0, calc2.multiply(0,0));
    }
    @Test
    void divide() {
        Calculator calc1 = new Calculator();
        assertEquals(0.25, calc1.divide(2,8));

        Calculator calc2 = new Calculator();
        assertEquals(1, calc2.divide(2,2));
    }
}