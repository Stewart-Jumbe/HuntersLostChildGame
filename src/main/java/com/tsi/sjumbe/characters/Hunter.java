package com.tsi.sjumbe.characters;

import com.tsi.sjumbe.world.Compass;

import java.util.Scanner;

public class Hunter {

    private double health;
    private double power_Level;
    private String name;
    private int[] characterPosition = new int[2];
    private int posX=0;
    private int posY=0;
    private Compass compass; // to be used for moving

    //Constructor
    public Hunter(){
        health = 100;
        power_Level = 1 ;
    }
    Scanner input = new Scanner(System.in);

    public String choiceDirection(){
        String chosenDirection = input.nextLine();
        return chosenDirection;
    }
    //Method to move character on the world Map
    public int move(Compass chosenDirection){
//        System.out.println("hunter which direction would you like travel, N, S, E or W?: ");
//        String direction = input.nextLine();
        if(Compass.NORTH.equals(chosenDirection)){
           return posY =+ 1;
        } else if (Compass.SOUTH.equals(chosenDirection)){
            return posY =- 1;
        } else if(Compass.EAST.equals(chosenDirection)){
            return posX =+ 1;
        }else{
            return posX =- 1;
        }
    }

    //Eat Method to raise power level




// Getters & Setters
    public int getPositionY(){
        return posY;
    }

    public int getPositionX(){
        return posX;
    }

    public double getHealth(){
        return health;
    }

    public double getPower_Level(){
        return power_Level;
    }

    public int[] setCharacterPosition( int posX, int posY){
    characterPosition[0]=posX;
    characterPosition[1]=posY;
    return characterPosition;
    };


}
