package com.example.spring.lesson18.mapper;

import com.example.spring.lesson18.dao.entity.CardEntity;
import com.example.spring.lesson18.model.request.CreateCardRequest;
import com.example.spring.lesson18.model.response.CardResponse;

import static com.example.spring.lesson18.model.enums.CardStatus.DRAFT;

public enum CardMapper {
    CARD_MAPPER;

    public CardEntity buildCardEntity(CreateCardRequest request) {
        return CardEntity.builder()
                .cardNumber(request.getCardNumber())
                .cardholderName(request.getCardholderName())
                .expiryDate(request.getExpiryDate())
                .cvv(request.getCvv())
                .cardType(request.getCardType())
                .issueDate(request.getIssueDate())
                .balance(request.getBalance())
                .status(DRAFT)
                .build();
    }

    public CardResponse buildCardResponse(CardEntity card) {
        return CardResponse.builder()
                .id(card.getId())
                .cardNumber(card.getCardNumber())
                .cardholderName(card.getCardholderName())
                .expiryDate(card.getExpiryDate())
                .cvv(card.getCvv())
                .cardType(card.getCardType())
                .issueDate(card.getIssueDate())
                .balance(card.getBalance())
                .status(card.getStatus())
                .build();
    }
}
