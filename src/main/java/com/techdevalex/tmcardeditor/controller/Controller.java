package com.techdevalex.tmcardeditor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.techdevalex.tmcardeditor.model.Card;
import com.techdevalex.tmcardeditor.service.CardService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// controller to handle the http requests, these handlers call the service functions to interact with the database
// tell Spring that this is a RestController, means that methods will return data directly
// otherwise spring would expect "views" to render html content, not sure what the implications would be
@RestController
public class Controller {
    // add CardService to the spring context
    @Autowired
    private CardService cardService;

    // A get request handler
    @GetMapping("/cards")
    public List<Card> getAllCards() {
        return cardService.getAllCards();
    }

    // A handler to create a card from the body of an http request
    @PostMapping("/card")
    public Card createCard(@RequestBody Card card) {
        cardService.saveCard(card);
        return card;
    }
    @PostMapping("/cards")
    public List<Card> createCards(@RequestBody List<Card> cards) {
        for (Card card : cards) {
            cardService.saveCard(card);
            
        }
        return cards;
    }

    // // 
    // @DeleteMapping("/cards"){
    //     public Card 
    // }

}
