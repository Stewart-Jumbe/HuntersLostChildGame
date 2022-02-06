package com.tsi.sjumbe.characters;

public class Enemy {

    private Enemy drego;
    int Health;

    public Enemy(){

    }

    public int [] dregoLocation(){
        int [] dregoLocation = new int [2];
        int randomX = (int) (Math.random() * 3) + 1;
        int randomY = (int) (Math.random() * 3) + 1;
        dregoLocation[0] = randomX;
        dregoLocation[1] = randomY;

        return dregoLocation;
    }

}
