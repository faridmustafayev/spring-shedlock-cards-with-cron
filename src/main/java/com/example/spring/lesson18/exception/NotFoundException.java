package com.example.spring.lesson18.exception;

import lombok.Getter;

@Getter
public class NotFoundException extends RuntimeException{
    private String code;
    public NotFoundException(String code, String message) {
        super(message);
        this.code = code;
    }
}
