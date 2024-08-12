package com.example;

import java.util.List;

public class Spaceship {    
    String name; 
    int level;
    int xp;
    int xpToLevel;
    int hp;
    private List<Weapon> weapons;


    Spaceship(String name, int hp ){
        this.name = name;
        this.hp = hp;
    }

    String getName(){
        return this.name;
    }

    int getHp(){
        return this.hp;
    }

    int getAmountWeapons(){
        int counter = 0;
        for(Weapon weapon: weapons){
            System.out.println(weapon);
            counter++;
        }
        return counter;
    }

    void printWeapons(){
        for(Weapon weapon : weapons)
        if(!(weapon.getCooldownRounds()>0)){
            System.out.println(weapon.getName());
        }
    }
    /* 
    int getDmg(){
        return this.dmg;
    }

    int getAccuracy(){
        return this.accuracy;
    }

    int calcDmg(){
        return this.dmg * this.accuracy;
    }
    */
    int levelUp(){
        return 1;
        //++ Statpoints
        //++ xpToLevelUp
    }


}
