package com.tsi.sjumbe.characters;

import com.tsi.sjumbe.world.Compass;

import java.util.Arrays;
import java.util.Scanner;

public class Hunter {

    private double health;
    private double power_Level;
    private int[] characterPosition = new int[2];
    private int[] currentPos = new int[2];
    private int posX=0;
    private int posY=0;

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
        if(Compass.NORTH.equals(chosenDirection) && posY <=2){
           return posY =posY + 1;
        }else if (Compass.NORTH.equals(chosenDirection) && posY ==3){
            return posY =0 ;

        } else if (Compass.SOUTH.equals(chosenDirection) && posY >=1){
            return posY =posY - 1;

        }else if (Compass.SOUTH.equals(chosenDirection) && posY==0){
            return posY = 3;

        } else if(Compass.EAST.equals(chosenDirection) && posX <=2){
            return posX =posX + 1;
        } else if(Compass.EAST.equals(chosenDirection) && posX ==3){
            return posX =0;

        } else if(Compass.WEST.equals(chosenDirection) && posX >=1){
            return posX =posX -1;

        } else{
            return posX = 3;
        }
    }

    //Eat Method to raise power level
    public void eatFood(int food){
        this.health = health + food;
}



// Getters & Setters
    public int getPositionY(){
        return posY;
    }

    public int getPositionX(){
        return posX;
    }

//    public Hunter getHero(){
//        return hero;
//    }

    public int[] getCurrentPosXY(){
        currentPos[0]= posX;
        currentPos[1]= posY;
        return currentPos;
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

/// To string

    @Override
    public String toString() {
        return
                "Your current posistion is " + Arrays.toString(currentPos);
    }
}
