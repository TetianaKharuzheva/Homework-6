package org.example;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Calculator {

    public int calculateSumOfTwoIntegerVaiues(int fistValue, int secondValue) {
        //int sum = fistValue + secondValue;
        //return sum;
        return fistValue + secondValue;
    }

    public double addTwoVaiues(double firstInputValue, double secondInputValue) {
        double result = firstInputValue + secondInputValue;
        //absolute value
        //return Math.abs(result);
        return result;
    }

    // Homework_6
    public int subtractionTwoIntengerVaiues(int firstInputValue, int secondInputValue) {
        int result = firstInputValue - secondInputValue;
        return result;
    }

    // add method firstValueIsMoreOfSecond
    public boolean isMore(int firstInputValue, int secondInputValue) {
        return firstInputValue > secondInputValue;

    }

    // /Homework_7
    // add division method
    public double divisionTwoValues(double firstInputValue, double secondInputValue) {
        double result = firstInputValue / secondInputValue;
        return result;

    }

    // add multipliplication method
    public double multiplicationTwoValues(double firstInputValue, double secondInputValue) {
        double result = firstInputValue * secondInputValue;
        return result;
    }

    // add squaring method
    public double squaringValue(double firstInputValue) {
        double result = Math.sqrt(firstInputValue);
        return result;
    }


}

