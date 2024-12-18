package com.techdevalex.tmcardeditor.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.techdevalex.tmcardeditor.model.Card;

// Create a card repository extending JpaRepository to provide CRUD operations for Card entities
// Type 1 is the type of the entity stored and the 2n the type of the entity's primary key
public interface CardRepository extends JpaRepository<Card, Long> {

}
