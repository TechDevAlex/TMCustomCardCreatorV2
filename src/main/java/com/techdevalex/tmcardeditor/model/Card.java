package com.techdevalex.tmcardeditor.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// declare card as an Entity for hibernate to manage
@Entity
public class Card {
    // annotate the Id as being the primary key for hibernate
    @Id
    // let hibernate generate the id, not sure how this works exactly, if a card
    // without Id is saved to the DB, hibernate creates the Id and also assigns it
    // to the object
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // hibernate implies the column creation and names from the fields
    // column creation without annotation was buggy (did not wortk if
    // declared below another annotation like @ElementCollection)
    // also its more readable -> manually annotated
    @Column
    String module;
    @Column
    String name;
    @ElementCollection
    // List is easier to work with (add remove contains), array's fixed size is
    // makes it more of a hassle for hibernate
    List<String> tags;
    @Column
    int cost;
    @Column
    String type;
    @ElementCollection
    List<String> requirements;
    @Embedded Metadata metadata;
    @Embedded ProductionBox productionBox;
    @ElementCollection
    List<String> compatibility;
    @Column
    String sourceFile;
    // Storing the sourcecode in a separate table
    @Column
    String sourceCode;
    

    public Card() {
        // empty constructor
    }

    public Card(String module, String name){
        this.module = module;
        this.name = name;
    }

    public String getModule(){
        return this.module;
    }

    public String getName() {
        return this.name;
    }

    public Long getId() {
        return this.id;
    }


    public void setModule(String module){
        this.module = module;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCompatibility() {
        return compatibility;
    }
    
    public void setCompatibility(List<String> compatibility) {
        this.compatibility = compatibility;
    }
    
    public String getSourceFile() {
        return sourceFile;
    }
    
    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }
    
    public String getSourceCode() {
        return sourceCode;
    }
    
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }
}

