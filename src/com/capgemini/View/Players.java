package com.capgemini.View;

import com.capgemini.Controller.CareersPlayers;
import com.capgemini.Controller.DistrictPlayers;

public class Players {
    public static void main(String[] args) {

    }

    public void showPlayers(){
        DistrictPlayers districtPlayers = new DistrictPlayers();
        districtPlayers.createPlayers();
        districtPlayers.showPlayers();

        CareersPlayers careersPlayers = new CareersPlayers();
        careersPlayers.createPlayers();
        careersPlayers.showPlayers();
    }
}
