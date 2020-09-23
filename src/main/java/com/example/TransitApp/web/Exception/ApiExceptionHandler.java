package com.example.TransitApp.web.Exception;

public class ApiExceptionHandler extends RuntimeException {
    public ApiExceptionHandler(String s) {
        super(s);
    }
}
