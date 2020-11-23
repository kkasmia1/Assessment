package com.tmobile.assessment.model;

public class NumberInfo {

    private int num;
    private String isOdd = "is odd";
    private String isEven = "is even";
    private String isPrime = "is prime";

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getIsOdd() {
        return isOdd;
    }

    public void setIsOdd(String isOdd) {
        this.isOdd = isOdd;
    }

    public String getIsEven() {
        return isEven;
    }

    public void setIsEven(String isEven) {
        this.isEven = isEven;
    }

    public String getIsPrime() {
        return isPrime;
    }

    public void setIsPrime(String isPrime) {
        this.isPrime = isPrime;
    }
}
