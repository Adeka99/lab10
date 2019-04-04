package com;

public enum ErrorCode {
    BAD_NUMBER("Input number is negative. Sqrt can't be taken!");

    private String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}