package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator instanceCalculator;

    @BeforeEach
    public void setUp() {
        instanceCalculator = new Calculator();
    }

    @Test
    public void sumOfTwoPositiveValues() {
        //precodition: creating instance of calculator class
        Calculator myCalculator = new Calculator();
        // call addTwoValues method from calculator and provide values
        double actualValue = myCalculator.addTwoVaiues(2, 5);

        assertEquals(7, actualValue);
    }

    @Test
    public void sumOfTwoNegativeValues() {
        //precodition: creating instance of calculator class
        Calculator myCalculator = new Calculator();
        // call addTwoValues method from calculator and provide values
        double actualValue = myCalculator.addTwoVaiues(-2, -5);

        assertEquals(-7, actualValue);
    }

    @Test
    public void sumOfPositiveAndNegativeValues() {
        //precodition: creating instance of calculator class
        Calculator myCalculator = new Calculator();
        // call addTwoValues method from calculator and provide values
        double actualValue = myCalculator.addTwoVaiues(2, -5);

        assertEquals(-3, actualValue);

    }

    @Test
    //method subtraction Homework_6

    public void subtractionOfTwoPositiveValues() {
        //precondition: creating instance of calculator class
        Calculator myCalculator = new Calculator();
        // call subtractionTwoIntengerVaiues method from calculator and provide values
        int actualValue = myCalculator.subtractionTwoIntengerVaiues(10, 5);

        assertEquals(5, actualValue);
    }

    @Test
    public void subtractionOfTwoEqualsValues() {
        Calculator myCalculator = new Calculator();
        int actualValue = myCalculator.subtractionTwoIntengerVaiues(5, 5);
        assertEquals(0, actualValue);
    }

    @Test
    public void subtractionOfBiggerAndZeroValues() {
        Calculator myCalculator = new Calculator();
        int actualValue = myCalculator.subtractionTwoIntengerVaiues(1000, 0);
        assertEquals(1000, actualValue);
    }

    @Test
    public void subtractionOfZeroAndBiggerValues() {
        Calculator myCalculator = new Calculator();
        int actualValue = myCalculator.subtractionTwoIntengerVaiues(0, 1000);
        assertEquals(-1000, actualValue);
    }

    @Test
    // method is More
    public void firstValuesMoreSecondValues() {
        Calculator myCalculator = new Calculator();
        boolean actualValue = myCalculator.isMore(25, 5);
        assertTrue(actualValue);
    }

    @Test
    public void firstValuesIsEqualSecondValues() {
        Calculator myCalculator = new Calculator();
        boolean actualValue = myCalculator.isMore(25, 25);
        assertFalse(actualValue);
    }

    @Test

    public void secondValuesIsMoreFirstValue() {
        Calculator myCalculator = new Calculator();
        boolean actualValue = myCalculator.isMore(5, 25);
        assertFalse(actualValue);
    }

    //Homework_7

    @Test
    public void divisionTwoPositiveValue() {
        double actualValue = instanceCalculator.divisionTwoValues(6.5, 3.2);
        System.out.println(actualValue);
        assertEquals(2.031, actualValue, 0.001);
    }

    @Test
    public void divisionZeroOnValue() {
        double actualValue = instanceCalculator.divisionTwoValues(0, 3.3);
        System.out.println(actualValue);
        assertEquals(0, actualValue);
    }

    @Test
    public void multiplicationOfTwoPositiveValue() {
        double actualValue = instanceCalculator.multiplicationTwoValues(5.123, 2.9);
        System.out.println(actualValue);
        assertEquals(14.856, actualValue, 0.001);
    }

    @Test
    public void squaringPositiveValue() {
        double actualValue = instanceCalculator.squaringValue(2.1);
        System.out.println(actualValue);
        assertEquals(1.449, actualValue, 0.001);
    }
}
