package com.example.spring.lesson18.controller;

import com.example.spring.lesson18.model.request.CreateCardRequest;
import com.example.spring.lesson18.model.response.CardResponse;
import com.example.spring.lesson18.service.abstraction.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequestMapping("v1/cards")
@RequiredArgsConstructor
public class CardController {
    private final CardService cardService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void createCard(@RequestBody CreateCardRequest request){
        cardService.createCard(request);
    }

    @GetMapping("/{id}")
    public CardResponse getCard(@PathVariable Long id){
        return cardService.getCard(id);
    }

    @GetMapping
    public List<CardResponse> getCards(){
        return cardService.getCards();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public void deleteCard(@PathVariable Long id){
        cardService.deleteCard(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(NO_CONTENT)
    public void updateCard(@PathVariable Long id,
                           CreateCardRequest request) {
        cardService.updateCard(id, request);
    }

}
