package com.techdevalex.tmcardeditor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdevalex.tmcardeditor.model.Card;
import com.techdevalex.tmcardeditor.repository.CardRepository;

// annotate as service component for spring 
@Service
public class CardService {
    // Add cardrepository to the Spring context
    @Autowired
    CardRepository cardRepository;

    // A method to return all cards
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    // A method to save a card to the db
    public Card saveCard(Card card){
        return cardRepository.save(card);
    }

}
