package com.capgemini.Controller;

import com.capgemini.Models.Career;
import com.capgemini.Models.Contestant;
import com.capgemini.Models.District;

import java.util.ArrayList;

public class PlayerController {
    private ArrayList<Contestant> contestants = new ArrayList<>();
    private int encouter;

    public ArrayList<Contestant> createPlayers(){
        for(int x=1; x < 19; x++){
            contestants.add(new District((int)(Math.random() * 101),(int)(Math.random() * 101),100,(int)(Math.random() * 101)));
        }
        for(int x=1; x < 7; x++){
            contestants.add(new Career((int)(Math.random() * 101),(int)(Math.random() * 101),100,(int)(Math.random() * 101)));
        }
        return contestants;
    }

    public String showPlayers(){
        this.createPlayers();
        this.encounter();

        int player = 1;
        int day = 1;
        String part2 = "";
        for(Contestant x: contestants){
            String[] nameClass = x.getClass().toString().split("\\.");
            part2 = nameClass[nameClass.length - 1];
            fight(x,x);

           // System.out.println("day" + day++ + ":" + part2);
            //System.out.println(part2 + " player: " + player++ + " Attack level:" + x.getAttackLevel() + " Defense level:" + x.getDefenseLevel() + " Health level:" + x.getHealthLevel() + " Chance level:" + x.getChanceLevel() );
        }
        return part2;
    }

    public void fight(Contestant attacker, Contestant defender) {
        int damage = Math.max(0, attacker.getAttackLevel() - defender.getDefenseLevel());
        int health = defender.getHealthLevel() - damage;

        //Nobody encountered
        if(this.encounter() == 0){
            System.out.println("nobody found");
            //run agian till encounter is 1 and let them fight.
            do {
                this.encounter();
            } while (this.encounter() == 0);

        }else{
            System.out.println("i meeeted someone!");
            System.out.println("defender is dood: " + defender.isDeath());
            if(health <= 0){
                System.out.println("defender is dood: " + defender.isDeath());
                defender.isDeath();
                System.out.println("Contestant is dood");
            }else if(health > 0){
                System.out.println("defender is dood: " + defender.isAlive());
                System.out.println("fight agian");
                //vecht weer
            }
        }

        defender.setHealthLevel(health);
    }

    public int encounter(){
        int random_integer = (int)(Math.random() * 2);
        return random_integer;
    }

}
