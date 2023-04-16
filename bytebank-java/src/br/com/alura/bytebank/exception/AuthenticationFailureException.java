package br.com.alura.bytebank.exception;

import br.com.alura.bytebank.enums.ExceptionsEnum;

public class AuthenticationFailureException extends Exception {
    @Override
    public String getMessage() {
        return ExceptionsEnum.AUTHENTICATION_FAILURE.getException();
    }
}