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
        for(int x=1; x < 8; x++){
            careersPlayers.add(new Contestants(1,2,3,4));
        }
        return careersPlayers;
    }

    public void showPlayers(){
        for(int i=1; i < careersPlayers.size(); i++ ){
            System.out.println("players:" + i);
        }
    }
}
