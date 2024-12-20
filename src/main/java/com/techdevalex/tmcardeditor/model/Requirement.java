package com.techdevalex.tmcardeditor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Requirement{
    @Id   
    public long id;

    String requirementType;
    Integer amount;

    public Requirement(){
        // empty constructor for hibernate
    }
    public String getRequirementType(){
        return this.requirementType;
    }

    public void setRequirementType(String requirementType){
        this.requirementType = requirementType;
    }

    public Integer getAmount(){
        return this.amount;
    }

    public void setAmount(Integer amount){
        this.amount = amount;
    }
}