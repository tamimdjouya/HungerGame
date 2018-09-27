package com.capgemini.Models;

public class Career extends Contestant {

    private int specialAttack = 20;

    public Career(int attackLevel, int defenseLevel, int healthLevel, int chanceLevel){
        super(attackLevel, defenseLevel, healthLevel, chanceLevel);
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }

}
