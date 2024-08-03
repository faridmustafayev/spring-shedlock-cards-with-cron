package com.example.spring.lesson18.model.response;

import com.example.spring.lesson18.model.enums.CardStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class CardResponse {
    private Long id;
    private String cardNumber;
    private String cardholderName;
    private LocalDate expiryDate;
    private String cvv;
    private String cardType;
    private LocalDate issueDate;
    private BigDecimal balance;
    private CardStatus status;
}
