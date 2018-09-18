package com.capgemini.Controller;

import com.capgemini.Models.Contestants;
import java.util.ArrayList;

public class DistrictPlayers {
    private ArrayList<Contestants> districtPlayers = new ArrayList<>();

    public static void main(String[] args) {
        DistrictPlayers districtPlayers = new DistrictPlayers();
        districtPlayers.createDistrictPlayers();
        districtPlayers.showDistrictPlayers();
    }

    public ArrayList<Contestants> createDistrictPlayers(){
        for(int x=1; x < 17; x++){
            districtPlayers.add(new Contestants(1,2,3,4,5));
        }
        return districtPlayers;
    }

    public void showDistrictPlayers(){
        for(int i=1; i < districtPlayers.size(); i++ ){
            System.out.println("players:" + i);
        }
    }
}
