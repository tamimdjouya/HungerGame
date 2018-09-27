package com.capgemini.View;

import com.capgemini.Controller.PlayerController;
import com.capgemini.Models.Contestant;

public class PlayersView {
    public static void main(String[] args) {

    }

    public void showPlayers(){
        PlayerController battleController = new PlayerController();
        battleController.showPlayers();
    }
}
