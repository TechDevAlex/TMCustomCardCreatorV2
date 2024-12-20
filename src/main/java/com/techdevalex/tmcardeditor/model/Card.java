package com.techdevalex.tmcardeditor.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;

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
    List<String> compatibility;
    @Column
    String sourceFile;
    @Column(columnDefinition = "TEXT")
    @Lob
    String sourceCode;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "card_id")
    List<Requirement>requirements;
    
    public List<Requirement> getRequirements(){
        return this.requirements;
    }

    public void setRequirements(List<Requirement> requirements){
        this.requirements = requirements;
    }

    public Card() {
        // empty constructor
    }
    public Long getId() {
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
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

    public List<String> getTags(){
        return this.tags;
    }

    public int getCost(){
        return this.cost;
    }

    public String getType(){
        return this.type;
    }

    public String getSourceCode(){
        return this.sourceCode;
    }



    public void setModule(String module){
        this.module = module;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTags(List<String> tags){
        this.tags = tags;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getSourceFile() {
        return this.sourceFile;
    }

    public List<String> getCompatibility() {
        return this.compatibility;
    }
    
    public void setCompatibility(List<String> compatibility) {
        this.compatibility = compatibility;
    }
    
    
    
    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }
    
    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }
}

