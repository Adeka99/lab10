package com;

public class Main {

    public static void main(String[] args) {
        arrayException();
        arithmetichException();
        try {
            System.out.println(NumExpExample.numSqrt(-100));
        } catch (MyException e) {
            System.out.println(e.getErrorString());
        }
    }

    public static void arrayException() {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void arithmetichException() {
        int a = 110, b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}
