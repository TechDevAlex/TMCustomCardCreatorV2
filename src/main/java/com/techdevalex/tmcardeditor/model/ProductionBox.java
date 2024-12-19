package com.techdevalex.tmcardeditor.model;

import jakarta.persistence.Embeddable;


@Embeddable
public class ProductionBox {
    private int megacredits;
    private int steel;
    private int titanium;
    private int plants;
    private int energy;
    private int heat;

    public int getMegacredits() {
        return megacredits;
    }

    public void setMegacredits(int megacredits) {
        this.megacredits = megacredits;
    }

    public int getSteel() {
        return steel;
    }

    public void setSteel(int steel) {
        this.steel = steel;
    }

    public int getTitanium() {
        return titanium;
    }

    public void setTitanium(int titanium) {
        this.titanium = titanium;
    }

    public int getPlants() {
        return plants;
    }

    public void setPlants(int plants) {
        this.plants = plants;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHeat() {
        return heat;
    }

    public void setHeat(int heat) {
        this.heat = heat;
    }
}