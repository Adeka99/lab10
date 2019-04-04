package com;

public class NumExpExample {
    public static double numSqrt(double num) throws MyException {
        if (num < 0) {
            throw new MyException(ErrorCode.BAD_NUMBER);
        }
        return Math.sqrt(num);
    }
}