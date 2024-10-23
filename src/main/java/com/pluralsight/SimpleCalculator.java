package com.pluralsight;

public class SimpleCalculator {

    public double addTwoNumbers(double x, double y) {
        return x + y;
    }

    public double divideTwoNumbers(double x, double y) {
        return x / y;
    }

    public double divideByZero(double x, double y) {
        if(x == 0 || y == 0){
            return 0;
        }else{

            return x / y;
        }

    }

    public static void main(String[] args) {

    }
}
