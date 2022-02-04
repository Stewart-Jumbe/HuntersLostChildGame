package com.tsi.sjumbe.world;

public class Story {
private String intro;

    //empty constructor
    public Story() {
    this.intro = intro();
    }

    public String intro() {
        String intro = " Villager: Tatu!, the Zoro Tribe have abducted your son from the training field.\nWe must hurry";
        return intro;
    }

    public String position1_1(int[] heroXposition, int[] heroYposition) {
       String story1_1 ="";
        if (heroXposition[0] == 1 && heroYposition[1] == 1) {
             story1_1 = "Narrator: You spot the fur of a Zoro's tuska (a creature adaptted to moving fast on mountanous terrain)\nYou: " +
                    "We cant't catch them on foot";

        }
        return story1_1;
    }

    public String position1_2(int[] heroXposition, int[] heroYposition) {
        String story1_2 ="";
        if (heroXposition[0] == 1 && heroYposition[1] == 1) {
            story1_2 = "Narrator: You spot the fur of a Zoro's tuska (a creature adaptted to moving fast on mountanous terrain)\nYou: " +
                    "We cant't catch them on foot";

        }
        return story1_2;
    }

    public String position1_3(int[] heroXposition, int[] heroYposition) {
        String story1_3 ="";
        if (heroXposition[0] == 1 && heroYposition[1] == 1) {
            story1_3 = "Narrator: You spot the fur of a Zoro's tuska (a creature adaptted to moving fast on mountanous terrain)\nYou: " +
                    "We cant't catch them on foot";

        }
        return story1_3;
    }




}
