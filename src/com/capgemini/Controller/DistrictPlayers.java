package com.capgemini.Controller;

import com.capgemini.Models.Contestants;
import java.util.ArrayList;

public class DistrictPlayers {
    private ArrayList<Contestants> districtPlayers = new ArrayList<>();

    public static void main(String[] args) {
        DistrictPlayers districtPlayers = new DistrictPlayers();
        districtPlayers.createPlayers();
        districtPlayers.showPlayers();
    }

    public ArrayList<Contestants> createPlayers(){
        for(int x=1; x < 19; x++){
            districtPlayers.add(new Contestants((int)(Math.random() * 101),(int)(Math.random() * 101),(int)(Math.random() * 101),(int)(Math.random() * 101)));
        }
        return districtPlayers;
    }

    public void showPlayers(){
//        for(int i =1; i < districtPlayers.size(); i++ ){
//
//        }
        int index = 1;
        for(Contestants x: districtPlayers){
            x.getAttackLevel();
            System.out.println("Player: " + index++ + " Attack level:" + x.getAttackLevel() + " Defense level:" + x.getDefenseLevel() + " Health level:" + x.getHealthLevel() + " Chance level:" + x.getChanceLevel() );
        }

    }
}
