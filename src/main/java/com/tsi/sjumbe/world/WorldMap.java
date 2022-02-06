package com.tsi.sjumbe.world;

import com.tsi.sjumbe.characters.Hunter;

import java.util.Scanner;
import java.util.Arrays;

public class WorldMap {

    private int[][] worldMap = new int[3][3];
    private Hunter hunter;// needed to instantiate hero on map creation
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
        hunter = new Hunter();
        food = new Food();
        int[] currentPos = new int[2];
        int[] Sonslocation = new int[2];

        //Setting starting position of character
        hunter.setCharacterPosition(0,0);
        //INTRO TO STORY
        System.out.println(story.intro());

        // Randomly placing the child on the map
        int randomX = (int) (Math.random() * 3) + 1;
        int randomY = (int) (Math.random() * 3) + 1;
        Sonslocation[0] = randomX;
        Sonslocation[1] = randomY;



        System.out.println("X value is: "+randomX +
                "\nY value is: "+ randomY);

        do{
        System.out.println("Which direction would you like to go? use (W A S D )");
        String chosenDirection =" ";
        chosenDirection = userInput.nextLine().toUpperCase();



            switch(chosenDirection){
                case "W":
                    hunter.move(Compass.NORTH);
                    hunter.getCurrentPosXY();
                    System.out.println(hunter.toString());
                    break;
                case "S":
                    hunter.move(Compass.SOUTH);
                    hunter.getCurrentPosXY();
                    System.out.println(hunter.toString());
                    break;
                case "A":
                    hunter.move(Compass.WEST);
                    hunter.getCurrentPosXY();
                    hunter.eatFood(food.deer());
                    System.out.println(hunter.toString());
                    break;
                case "D":
                    hunter.move(Compass.EAST);
                    hunter.getCurrentPosXY();
                    System.out.println(hunter.toString());
                    break;
                default:
                    message = "That's not a direction";
                    System.out.println(message);
            }
            //Converting player position into a string to be used for story switch case
            String xPostionString = String.valueOf(hunter.getPositionX());
            String yPositionString = String.valueOf(hunter.getPositionY());
            String xyPositionString =xPostionString+yPositionString;

            //If statement checking if player has found child's location
            if( Arrays.equals(Sonslocation, hunter.getCurrentPosXY())){
                System.out.println("You've found your son!!");
            }else{

            //Switch statement to tell story
            switch(xyPositionString){

                case "00":
                    System.out.println(story.position0_0());
                    break;
                case"01":
                    System.out.println(story.position0_1());
                    break;
                case"02":
                    System.out.println(story.position0_2());
                    break;
                case"03":
                    System.out.println(story.position0_3());
                    break;
                case "10":
                    System.out.println(story.position1_0());
                    break;
                case"11":
                    System.out.println(story.position1_1());
                    break;
                case"12":
                    System.out.println(story.position1_2());
                    break;
                case"13":
                    System.out.println(story.position1_3());
                    break;
                default:
                    message = "OOH....The Story for this location in underdevelopment please come back later";
                    System.out.println(message);
            }
            }

}
    while (Arrays.equals(Sonslocation, hunter.getCurrentPosXY())==false);





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