package com.capgemini.Controller;

import com.capgemini.Models.Contestants;

import java.util.ArrayList;

public class CareersPlayers {
    private ArrayList<Contestants> careersPlayers = new ArrayList<>();

    public static void main(String[] args) {
        CareersPlayers careersPlayers = new CareersPlayers();
        careersPlayers.createPlayers();
        careersPlayers.showPlayers();
    }

    public ArrayList<Contestants> createPlayers(){
        for(int x=1; x < 7; x++){
            careersPlayers.add(new Contestants((int)(Math.random() * 101),(int)(Math.random() * 101),(int)(Math.random() * 101),(int)(Math.random() * 101)));
        }
        return careersPlayers;
    }

    public void showPlayers(){
        int player = 1;
        for(Contestants x: careersPlayers){
            x.getAttackLevel();
            System.out.println("Career player: " + player++ + " Attack level:" + x.getAttackLevel() + " Defense level:" + x.getDefenseLevel() + " Health level:" + x.getHealthLevel() + " Chance level:" + x.getChanceLevel() );
        }
    }
}
