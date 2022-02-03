import com.tsi.sjumbe.characters.Hunter;
import com.tsi.sjumbe.world.Compass;
import com.tsi.sjumbe.world.WorldMap;

public class Main {

    public static void main(String[] args) {

   WorldMap azuMountains = new WorldMap();

    azuMountains.getHero().move(Compass.EAST);
    azuMountains.getHero().move(Compass.SOUTH);
    azuMountains.getHero().move(Compass.EAST);
    azuMountains.getHero().move(Compass.EAST);

        System.out.println(azuMountains.getHero().getPositionX());
        System.out.println(azuMountains.getHero().getPositionY());
        //        System.out.println(hero.getPositionY());
//



        };



        }




