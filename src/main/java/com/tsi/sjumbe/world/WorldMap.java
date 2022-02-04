package com.tsi.sjumbe.world;

import com.tsi.sjumbe.characters.Hunter;

import java.util.Scanner;

public class WorldMap {

    private int[][] worldMap = new int[3][3];
    private Hunter hero;// needed to instantiate hero on map creation
    private Story story;
    private Food food; //need to make food available on map creation
    private Compass compass;
    private String message;

    Scanner userInput;

    {
        userInput = new Scanner(System.in);
    }

    ///World Map Constructor
    public WorldMap() {

        story = new Story();
        hero = new Hunter();
        food = new Food();
        int[] currentPos = new int[2];
        int[] Sonlocation = new int[2];

        do{
        hero.setCharacterPosition(0,0);


        // Randomly placing the child on the map
        int randomX = (int) (Math.random() * 3) + 1;
        int randomY = (int) (Math.random() * 3) + 1;
        Sonlocation[0] = randomX;
        Sonlocation[1] = randomY;
        //System.out.println("SonsLocation X: "+Sonlocation[0]);
        //System.out.println("SonsLocation Y: " +Sonlocation[1]);

        System.out.println(story.intro());

        System.out.println("Which direction would you like to go? use (W A S D )");
        String chosenDirection = userInput.nextLine().toUpperCase();
        System.out.println("chosenDirection is: " + chosenDirection);

            switch(chosenDirection){
                case "W":
                    hero.move(Compass.NORTH);
                    hero.getCurrentPosXY();
                    break;
                case "S":
                    hero.move(Compass.SOUTH);
                    break;
                case "A":
                    hero.move(Compass.WEST);
                    hero.eatFood(food.deer());
                    break;
                case "D":
                    hero.move(Compass.EAST);
                    break;
                default:
                    message = "That's not direction";
            }
            System.out.println(message);
}
    while (currentPos[0] != Sonlocation[0] && currentPos[1] != Sonlocation[1]);





//            System.out.println(azuMountains.getHero().toString());

        System.out.println("Finished");




    }



    //Method that gives access to methods in story class through the world map
//    public Story getStory(){
//        return story;
//    }

    public Food getFood(){
        return food;
    }



    public Compass directionToMoveIn(){
        return compass;
    }

}