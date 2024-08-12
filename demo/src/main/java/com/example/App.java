package com.example;

import java.util.Scanner;


public class App 
{
    
    public static void main( String[] args )
    {
        if(MainMenu.musikEnabled == true) {
            AudioPlayer.playMenu();
        }
        Scanner scanner = new Scanner(System.in);
        MainMenu.display();
        int choice = scanner.nextInt();
        MainMenu.handleInput(choice);

        //Go to next menu
    }
}
