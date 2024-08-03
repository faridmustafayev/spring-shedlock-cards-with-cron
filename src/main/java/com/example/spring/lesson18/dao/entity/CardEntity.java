package com.example.spring.lesson18.dao.entity;

import com.example.spring.lesson18.model.enums.CardStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

import static jakarta.persistence.EnumType.*;
import static jakarta.persistence.GenerationType.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "cards")
public class CardEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String cardNumber;

    private String cardholderName;

    private LocalDate expiryDate;

    private String cvv;

    private String cardType;

    private LocalDate issueDate;

    private BigDecimal balance;

    @Enumerated(STRING)
    private CardStatus status;
}
