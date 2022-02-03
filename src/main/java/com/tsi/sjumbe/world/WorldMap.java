package com.tsi.sjumbe.world;

import com.tsi.sjumbe.characters.Hunter;

public class WorldMap {

    private int[][] worldMap = new int[3][3];
    private Hunter hero;// needed to instantiate hero on map creation
    private Food food; //need to make food available on map creation
    private Compass compass;


    public WorldMap() {
        hero = new Hunter();
        hero.setCharacterPosition(0,0);
    }

    public Hunter getHero(){
        return hero;
    }

    public Food getFood(){
        return food;
    }

    public Compass directionToMoveIn(){
        return compass;
    }

}