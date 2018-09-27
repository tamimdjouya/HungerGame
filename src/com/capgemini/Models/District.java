package com.capgemini.Models;

public class District extends Contestant {

    private int specialDefense = 20;


    public District(int attackLevel, int defenseLevel, int healthLevel, int chanceLevel){
        super(attackLevel, defenseLevel, healthLevel, chanceLevel);
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public void setSpecialDefense(int specialDefense) {
        this.specialDefense = specialDefense;
    }

}
