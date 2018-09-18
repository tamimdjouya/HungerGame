package com.capgemini.Models;

public class Contestants{
    private int attackLevel;
    private int defenseLevel;
    private int healthLevel;
    private int changeLevel;
    private int trainingLevel;
    private boolean endDay;
    private boolean death;
    private boolean alive;

    private String longSword; // attack +5
    private String defenseKit; // defense +5

    public Contestants(int attackLevel, int defenseLevel, int healthLevel, int changeLevel, int trainingLevel){
        this.attackLevel = attackLevel;
        this.defenseLevel = defenseLevel;
        this.healthLevel = healthLevel;
        this.changeLevel = changeLevel;
        this.trainingLevel = trainingLevel;
    }

    public int getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public int getDefenseLevel() {
        return defenseLevel;
    }

    public void setDefenseLevel(int defenseLevel) {
        this.defenseLevel = defenseLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getChangeLevel() {
        return changeLevel;
    }

    public void setChangeLevel(int changeLevel) {
        this.changeLevel = changeLevel;
    }

    public int getTrainingLevel() {
        return trainingLevel;
    }

    public void setTrainingLevel(int trainingLevel) {
        this.trainingLevel = trainingLevel;
    }

    public boolean isEndDay() {
        return endDay;
    }

    public void setEndDay(boolean endDay) {
        this.endDay = endDay;
    }

    public boolean isDeath() {
        return death;
    }

    public void setDeath(boolean death) {
        this.death = death;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getLongSword() {
        return longSword;
    }

    public void setLongSword(String longSword) {
        this.longSword = longSword;
    }

    public String getDefenseKit() {
        return defenseKit;
    }

    public void setDefenseKit(String defenseKit) {
        this.defenseKit = defenseKit;
    }
}
