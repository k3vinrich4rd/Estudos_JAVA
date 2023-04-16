package br.com.alura.bytebank.enums;

public enum ExceptionsEnum {
    INSUFFICIENT_BALANCE("Error, insufficient balance to perform this action"),
    AUTHENTICATION_FAILURE("Authentication failure, try again");

    private final String exception;

    ExceptionsEnum(String exception) {
        this.exception = exception;
    }

    public String getException() {
        return this.exception;
    }
}