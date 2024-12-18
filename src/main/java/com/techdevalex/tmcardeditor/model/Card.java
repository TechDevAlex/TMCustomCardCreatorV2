package com.techdevalex.tmcardeditor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// declare card as an Entity for hibernate to manage
@Entity
public class Card {
    // annotate the Id as being the primary key for hibernate
    @Id
    // let hibernate generate the id, not sure how this works exactly
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String name;
    
    public Card(){
        // empty constructor
    }
    
    public String getName(){
        return this.name;
    }

    public Long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(Long id){
        this.id = id;
    }
}
