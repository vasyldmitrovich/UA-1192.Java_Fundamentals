package com.softserve.edu05.hw;

public class StatsCalculatorResult {

    private int secondPositivePosition;

    private int min;

    private int minPosition;

    private int productOfEvenNumbers;

    public StatsCalculatorResult() {
        this.secondPositivePosition = 0;
        this.min = 0;
        this.minPosition = 0;
        this.productOfEvenNumbers = 0;
    }

    public StatsCalculatorResult(int secondPositivePosition, int min, int minPosition, int productOfEvenNumbers) {
        this.secondPositivePosition = secondPositivePosition;
        this.min = min;
        this.minPosition = minPosition;
        this.productOfEvenNumbers = productOfEvenNumbers;
    }

    public int getSecondPositivePosition() {
        return secondPositivePosition;
    }

    public void setSecondPositivePosition(int secondPositivePosition) {
        this.secondPositivePosition = secondPositivePosition;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMinPosition() {
        return minPosition;
    }

    public void setMinPosition(int minPosition) {
        this.minPosition = minPosition;
    }

    public int getProductOfEvenNumbers() {
        return productOfEvenNumbers;
    }

    public void setProductOfEvenNumbers(int productOfEvenNumbers) {
        this.productOfEvenNumbers = productOfEvenNumbers;
    }
}
