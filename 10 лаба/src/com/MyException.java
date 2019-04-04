package com;

public class MyException extends Exception {
    private ErrorCode code;

    MyException(ErrorCode code) {
        this.code = code;
    }

    public ErrorCode getCode() {
        return code;
    }

    public String getErrorString() {
        return code.getMessage();
    }
}
