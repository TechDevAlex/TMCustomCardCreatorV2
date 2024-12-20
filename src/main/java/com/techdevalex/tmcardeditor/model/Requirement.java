package com.techdevalex.tmcardeditor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Requirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    String requirementType;
    Integer amount;
    Integer count;
    Integer oceans;
    Integer oxygen;
    Integer temperature;
    String tag;
    Boolean max;
    String text;
    Integer tr;
    Integer venus;
    Integer floaters;
    Boolean plantsRemoved;
    Integer cities;
    Integer colonies;
    String nextTo;
    String resourceTypes;
    String party;
    String partyLeader;
    Integer habitatRate;
    Integer habitatTiles;
    Integer miningRate;
    Integer miningTiles;
    Integer logisticRate;
    Integer roadTiles;
    String production;
    Integer excavation;
    Boolean chairman;
    Integer corruption;
    Integer greeneries;

    public Requirement() {
        // Empty constructor for Hibernate
    }

    public String getRequirementType() {
        return this.requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }

    public Integer getAmount() {
        return this.amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getCount() {
        return this.count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getOceans() {
        return this.oceans;
    }

    public void setOceans(Integer oceans) {
        this.oceans = oceans;
    }

    public Integer getOxygen() {
        return this.oxygen;
    }

    public void setOxygen(Integer oxygen) {
        this.oxygen = oxygen;
    }

    public Integer getTemperature() {
        return this.temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Boolean getMax() {
        return this.max;
    }

    public void setMax(Boolean max) {
        this.max = max;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getTr() {
        return this.tr;
    }

    public void setTr(Integer tr) {
        this.tr = tr;
    }

    public Integer getVenus() {
        return this.venus;
    }

    public void setVenus(Integer venus) {
        this.venus = venus;
    }

    public Integer getFloaters() {
        return this.floaters;
    }

    public void setFloaters(Integer floaters) {
        this.floaters = floaters;
    }

    public Boolean getPlantsRemoved() {
        return this.plantsRemoved;
    }

    public void setPlantsRemoved(Boolean plantsRemoved) {
        this.plantsRemoved = plantsRemoved;
    }

    public Integer getCities() {
        return this.cities;
    }

    public void setCities(Integer cities) {
        this.cities = cities;
    }

    public Integer getColonies() {
        return this.colonies;
    }

    public void setColonies(Integer colonies) {
        this.colonies = colonies;
    }

    public String getNextTo() {
        return this.nextTo;
    }

    public void setNextTo(String nextTo) {
        this.nextTo = nextTo;
    }

    public String getResourceTypes() {
        return this.resourceTypes;
    }

    public void setResourceTypes(String resourceTypes) {
        this.resourceTypes = resourceTypes;
    }

    public String getParty() {
        return this.party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getPartyLeader() {
        return this.partyLeader;
    }

    public void setPartyLeader(String partyLeader) {
        this.partyLeader = partyLeader;
    }

    public Integer getHabitatRate() {
        return this.habitatRate;
    }

    public void setHabitatRate(Integer habitatRate) {
        this.habitatRate = habitatRate;
    }

    public Integer getHabitatTiles() {
        return this.habitatTiles;
    }

    public void setHabitatTiles(Integer habitatTiles) {
        this.habitatTiles = habitatTiles;
    }

    public Integer getMiningRate() {
        return this.miningRate;
    }

    public void setMiningRate(Integer miningRate) {
        this.miningRate = miningRate;
    }

    public Integer getMiningTiles() {
        return this.miningTiles;
    }

    public void setMiningTiles(Integer miningTiles) {
        this.miningTiles = miningTiles;
    }

    public Integer getLogisticRate() {
        return this.logisticRate;
    }

    public void setLogisticRate(Integer logisticRate) {
        this.logisticRate = logisticRate;
    }

    public Integer getRoadTiles() {
        return this.roadTiles;
    }

    public void setRoadTiles(Integer roadTiles) {
        this.roadTiles = roadTiles;
    }

    public String getProduction() {
        return this.production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public Integer getExcavation() {
        return this.excavation;
    }

    public void setExcavation(Integer excavation) {
        this.excavation = excavation;
    }

    public Boolean getChairman() {
        return this.chairman;
    }

    public void setChairman(Boolean chairman) {
        this.chairman = chairman;
    }

    public Integer getCorruption() {
        return this.corruption;
    }

    public void setCorruption(Integer corruption) {
        this.corruption = corruption;
    }

    public Integer getGreeneries() {
        return this.greeneries;
    }

    public void setGreeneries(Integer greeneries) {
        this.greeneries = greeneries;
    }
}
