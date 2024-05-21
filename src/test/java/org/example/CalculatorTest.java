package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CalculatorTest {
    @Test
    public void sumOfTwoPositiveValues(){
        //precodition: creating instance of calculator class
        Calculator myCalculator= new Calculator();
        // call addTwoValues method from calculator and provide values
        double actualValue = myCalculator.addTwoVaiues(2,5);

        assertEquals( 7 , actualValue);
    }
    @Test
    public void sumOfTwoNegativeValues(){
        //precodition: creating instance of calculator class
        Calculator myCalculator= new Calculator();
        // call addTwoValues method from calculator and provide values
        double actualValue = myCalculator.addTwoVaiues(-2,-5);

        assertEquals( -7 , actualValue);
    }
    @Test
    public void sumOfPositiveAndNegativeValues(){
        //precodition: creating instance of calculator class
        Calculator myCalculator= new Calculator();
        // call addTwoValues method from calculator and provide values
        double actualValue = myCalculator.addTwoVaiues(2,-5);

        assertEquals( -3 , actualValue);




    }
}
