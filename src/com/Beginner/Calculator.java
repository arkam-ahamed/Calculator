package com.Beginner;

public class Calculator {
    private int addValue;
    private int subtractValue;
    private double divideValue;
    private int multiplyValue;

     public Calculator() {

    }

    public int getAddValue(int a, int b) {
        addValue = a + b;
        return addValue;
    }

    public void setAddValue(int addValue) {
        this.addValue = addValue;
    }

    public int getSubtractValue(int a, int b) {
        subtractValue = a - b;
        return subtractValue;
    }

    public void setSubtractValue(int subtractValue) {
        this.subtractValue = subtractValue;
    }

    public double getDivideValue(double a, double b) {
        divideValue = a / b;
        return divideValue;
    }



    public int getMultiplyValue(int a, int b) {
        multiplyValue = a * b;
        return multiplyValue;
    }

    public void setMultiplyValue(int multiplyValue) {
        this.multiplyValue = multiplyValue;

    }
}
