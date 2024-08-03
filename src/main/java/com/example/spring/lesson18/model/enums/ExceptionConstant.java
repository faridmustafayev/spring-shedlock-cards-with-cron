package com.example.spring.lesson18.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ExceptionConstant {
    CARD_NOT_FOUND("CARD_NOT_FOUND", "Card not found"),
    UNEXPECTED_EXCEPTION("UNEXPECTED_EXCEPTION", "Unexpected exception occurred");
    private String code;
    private String message;
}
