package com.example;

import java.util.Scanner;

public class MainMenu {
    static boolean musikEnabled = true;
    Scanner scanner = new Scanner(System.in);

    static String checkMusicStatus(){
        if(MainMenu.musikEnabled==true){
            return "AN";
        } else {
            return "AUS";
        }
    }

    static String[] mainMenuItems = {
        "[1]Neues Spiel",
        "[2]Spiel laden",
        "[3]Musik " + checkMusicStatus() + " :ändern",
        "[4]Beenden"
    };

    public static void display(){
        for(String item : mainMenuItems){
            System.out.println(item);
            int choice = scanner.nextInt();
        }
    }
    public static void handleInput(int choice){
        switch(choice){
            case 1 : //neues Spiel -> create spaceship ,
            case 2 : //spiel laden -> aus csv lesen, wenn leer, dann Sys.out.print,
            case 3 : MainMenu.musikEnabled = false;
            MainMenu.display();
            case 4 : System.exit(0);
        }
    }

    
    

}
