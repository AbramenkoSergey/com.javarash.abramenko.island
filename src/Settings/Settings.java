package Settings;

import entity.creature.factory.CREATURE_TYPE;

import java.util.HashMap;
import java.util.Map;

public class Settings {
    public final static String wolf = "\uD83D\uDC3A";

    public static Map<CREATURE_TYPE, SettigsAnimal> CREATURE_SETTINGS = new HashMap<CREATURE_TYPE, SettigsAnimal>();
    static {
        //шанс съесть
        CREATURE_SETTINGS.put(CREATURE_TYPE.WOLF,new SettigsAnimal(50,3, 8,
                Map.of(CREATURE_TYPE.HORSE,10, CREATURE_TYPE.DEER,15)));

    }



//    public static int Weight = 50;
    public final static int wolfMaxInLocate = 30;
    public final static int wolfTravelRange = 3;
//    public  static double FullSaturation = 8;

    public final static int chanceToEatHorse = 10;
    public final static int chanceToEatDeer = 15;
    public final static int chanceToEatRabbit = 60;
    public final static int chanceToEatMouse = 80;
    public final static int chanceToEatSheep = 70;
    public final static int chanceToEatBoar = 15;
    public final static int chanceToEatBuffalo = 10;
    public final static int chanceToEatDuck = 40;


}
