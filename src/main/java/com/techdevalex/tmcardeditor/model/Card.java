package com.techdevalex.tmcardeditor.model;

import jakarta.persistence.Entity;

@Entity
public class Card {
    String name;
    
    public Card(){
        // empty constructor
    }
    
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
