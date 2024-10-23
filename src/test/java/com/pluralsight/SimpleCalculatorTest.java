package com.pluralsight;

import org.junit.jupiter.api.Test;
//import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void addTwoNumbers_positiveNrs() {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        double result = simpleCalculator.addTwoNumbers(2, 4);
        assertEquals(6, result);
    }

    @Test
    void addTwoNumbers_negativeNrs() {
        // arrange
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.addTwoNumbers(-2, -4);
        // assert
        assertEquals(-6, result);
    }

    @Test
    public void divideTwoNumbers_positiveNums(){
        // arrange
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.divideTwoNumbers(4, 2);
        // assert
        assertEquals(2, result);
    }

    @Test
    public void divideTwoNumbers_oneNegOnePos(){
        // arrange
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.divideTwoNumbers(4, -2);
        // assert
        assertEquals(-2, result);
    }

    @Test
    public void divideTwoNumbers_twoNegaticeNums(){
        // arrange
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.divideTwoNumbers(-4, -2);
        // assert
        assertEquals(2, result);
    }

    @Test
    public void divideTwoNumbers_divideByZero(){
        // arrange
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        // act
        double result = simpleCalculator.divideByZero(-4, 0);
        // assert
        assertEquals(0, result);
    }

}