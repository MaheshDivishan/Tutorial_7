package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerSelection {




    public static void main(String[] args) {
    String[] players = new String[7];
    players[0]=("Smith");
    players[1]=("Silva");
    players[2]=("Mendis");
    players[3]=("Warner");
    players[4]=("Bravo");
    players[5]=("Anderson");
    players[6]=("Andrew");
    players[7]=("Smith");

    while(true){
        System.out.print("Enter A to add player : ");
        System.out.print("Enter B to Display two Batsmans : ");
        System.out.print("Enter C to Display two Batsmans : ");
        System.out.print("Enter D to Display the Best Keeper : ");
        System.out.print("Enter V to Display the View All Players : ");

        System.out.print("Enter a Number: ");
        Scanner in = new Scanner(System.in);
        String x = in.next();

        switch(x){
            case "A":
                addPlayer();
                break;
            case "B":

        }
    }


}

    public static void addPlayer() {

        Scanner in = new Scanner(System.in);
        System.out.print("What is player Name :");
        System.out.print("Enter a Number :");
        int i = in.nextInt();


        String y = in.next();

    }


}
