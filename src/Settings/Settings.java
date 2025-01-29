package Settings;

import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.predator.Wolf;
import entity.creature.factory.CREATURE_TYPE;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Settings {

    public final static int columnsCount = 2;
    public final static int rowsCount = 2;
//    public final static int SIMULATION_DAY = 25;

    public final static String BEAR_IMAGE = "\uD83D\uDC3B";
    public final static String BOAR_IMAGE = "\uD83D\uDC17";
    public final static String BOA_IMAGE = "\uD83D\uDC0D";
    public final static String BUFFALO_IMAGE = "\uD83D\uDC03";
    public final static String CATERPILLAR_IMAGE = "\uD83D\uDC1B";
    public final static String DEAR_IMAGE = "\uD83D\uDC11";
    public final static String DUCK_IMAGE = "\uD83E\uDD86";
    public final static String EAGLE_IMAGE = "\uD83E\uDD85";
    public final static String FOX_IMAGE = "\uD83E\uDD8A";
    public final static String GOAT_IMAGE = "\uD83D\uDC10";
    public final static String HORSE_IMAGE = "\uD83D\uDC0E";
    public final static String MOUSE_IMAGE = "\uD83D\uDC01";
    public final static String RABBIT_IMAGE = "\uD83D\uDC07";
    public final static String SHEEP_IMAGE = "\uD83D\uDC11";
    public final static String WOLF_IMAGE = "\uD83D\uDC3A";
    public final static String PLANT_IMAGE = "\uD83C\uDF3F";

    public static Map<CREATURE_TYPE, SettigsAnimal> CREATURE_SETTINGS = new HashMap<CREATURE_TYPE, SettigsAnimal>();

    public static ArrayList wolfVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.HORSE,CREATURE_TYPE.DEER, CREATURE_TYPE.RABBIT,CREATURE_TYPE.MOUSE,
            CREATURE_TYPE.SHEEP,CREATURE_TYPE.BOAR,CREATURE_TYPE.BUFFALO,CREATURE_TYPE.DUCK));
    public static ArrayList bearVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.BOA,
            CREATURE_TYPE.HORSE, CREATURE_TYPE.DEER, CREATURE_TYPE.RABBIT, CREATURE_TYPE.MOUSE, CREATURE_TYPE.SHEEP, CREATURE_TYPE.GOAT,
            CREATURE_TYPE.BOAR, CREATURE_TYPE.BUFFALO, CREATURE_TYPE.DUCK));
    public static ArrayList boaVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.FOX,
            CREATURE_TYPE.RABBIT, CREATURE_TYPE.MOUSE, CREATURE_TYPE.DUCK));
    public static ArrayList boarVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.PLANT,
            CREATURE_TYPE.CATERPILLAR, CREATURE_TYPE.MOUSE));
    public static ArrayList buffaloVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.PLANT));
    public static ArrayList caterpillarVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.PLANT));
    public static ArrayList deerVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.PLANT));
    public static ArrayList duckVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.PLANT,CREATURE_TYPE.CATERPILLAR));
    public static ArrayList eagleVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.FOX,10,
            CREATURE_TYPE.RABBIT,CREATURE_TYPE.MOUSE,CREATURE_TYPE.DUCK));
    public static ArrayList foxVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.RABBIT,
            CREATURE_TYPE.MOUSE, CREATURE_TYPE.SHEEP, CREATURE_TYPE.DUCK, CREATURE_TYPE.CATERPILLAR));
    public static ArrayList goatVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.PLANT));
    public static ArrayList horseVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.PLANT));
    public static ArrayList rabbitVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.PLANT));
    public static ArrayList sheepVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.PLANT));
    public static ArrayList mouseVictim = new ArrayList(Arrays.asList(CREATURE_TYPE.PLANT,CREATURE_TYPE.CATERPILLAR));

    static {
        //шанс съесть
        CREATURE_SETTINGS.put(CREATURE_TYPE.WOLF,new SettigsAnimal(50,3, 8,
                Map.of(CREATURE_TYPE.HORSE,10,
                        CREATURE_TYPE.DEER,15,
                        CREATURE_TYPE.RABBIT, 60,
                        CREATURE_TYPE.MOUSE,80,
                        CREATURE_TYPE.SHEEP,70,
                        CREATURE_TYPE.BOAR,15,
                        CREATURE_TYPE.BUFFALO,10,
                        CREATURE_TYPE.DUCK,40)));


        CREATURE_SETTINGS.put(CREATURE_TYPE.BEAR,new SettigsAnimal(500,2,80,
                Map.of(CREATURE_TYPE.BOA,80,
                        CREATURE_TYPE.HORSE,40,
                        CREATURE_TYPE.DEER,80,
                        CREATURE_TYPE.RABBIT,80,
                        CREATURE_TYPE.MOUSE,90,
                        CREATURE_TYPE.SHEEP,70,
                        CREATURE_TYPE.GOAT,70,
                        CREATURE_TYPE.BOAR,50,
                        CREATURE_TYPE.BUFFALO,20,
                        CREATURE_TYPE.DUCK,10)));
        //удав
        CREATURE_SETTINGS.put(CREATURE_TYPE.BOA, new SettigsAnimal(15,1,3,
                Map.of(CREATURE_TYPE.FOX,15,
                        CREATURE_TYPE.RABBIT,20,
                        CREATURE_TYPE.MOUSE,40,
                        CREATURE_TYPE.DUCK,10)));
        //кабан
        CREATURE_SETTINGS.put(CREATURE_TYPE.BOAR, new SettigsAnimal(400,2,50,
                Map.of(CREATURE_TYPE.PLANT,100,
                        CREATURE_TYPE.CATERPILLAR,90,
                        CREATURE_TYPE.MOUSE,50)));
        CREATURE_SETTINGS.put(CREATURE_TYPE.BUFFALO,new SettigsAnimal(70,3,100,
                Map.of(CREATURE_TYPE.PLANT,100)));
        //гусеница
        CREATURE_SETTINGS.put(CREATURE_TYPE.CATERPILLAR, new SettigsAnimal(0.01,0,0,
                Map.of(CREATURE_TYPE.PLANT,100)));
        //олень
        CREATURE_SETTINGS.put(CREATURE_TYPE.DEER, new SettigsAnimal(300,4,50,
                Map.of(CREATURE_TYPE.PLANT,100)));
        CREATURE_SETTINGS.put(CREATURE_TYPE.DUCK, new SettigsAnimal(1,4,0.15,
                Map.of(CREATURE_TYPE.PLANT,100,
                        CREATURE_TYPE.CATERPILLAR,90)));
        //орел
        CREATURE_SETTINGS.put(CREATURE_TYPE.EAGLE, new SettigsAnimal(6,3,1,
                Map.of(CREATURE_TYPE.FOX,10,
                        CREATURE_TYPE.RABBIT,90,
                        CREATURE_TYPE.MOUSE,90,
                        CREATURE_TYPE.DUCK,80)));
        CREATURE_SETTINGS.put(CREATURE_TYPE.FOX, new SettigsAnimal(8,2,2,
                Map.of(CREATURE_TYPE.RABBIT,70,
                        CREATURE_TYPE.MOUSE,90,
                        CREATURE_TYPE.SHEEP,70,
                        CREATURE_TYPE.DUCK,60,
                        CREATURE_TYPE.CATERPILLAR,40)));
        //коза
        CREATURE_SETTINGS.put(CREATURE_TYPE.GOAT,new SettigsAnimal(60,3,10,
                Map.of(CREATURE_TYPE.PLANT,100)));
        CREATURE_SETTINGS.put(CREATURE_TYPE.HORSE,new SettigsAnimal(400,40,60,
                Map.of(CREATURE_TYPE.PLANT,100)));
        CREATURE_SETTINGS.put(CREATURE_TYPE.PLANT, new SettigsAnimal(1,0,0,
                Map.of()));
        CREATURE_SETTINGS.put(CREATURE_TYPE.RABBIT, new SettigsAnimal(2,2,0.45,
                Map.of(CREATURE_TYPE.PLANT,100)));
        CREATURE_SETTINGS.put(CREATURE_TYPE.SHEEP,new SettigsAnimal(3,3,15,
                Map.of(CREATURE_TYPE.PLANT,100)));
        CREATURE_SETTINGS.put(CREATURE_TYPE.MOUSE,new SettigsAnimal(3,3,15,
                Map.of(CREATURE_TYPE.PLANT,100,
                        CREATURE_TYPE.CATERPILLAR,90)));

    }
    public static final int BEAR_MAX_IN_LOCATE = 5;
    public final static int BOA_MAX_IN_LOCATE = 30;
    public final static int BUFFALO_MAX_IN_LOCATE = 10;
    public final static int CATERPILLAR_MAX_IN_LOCATE = 1000;
    public final static int DEAR_MAX_IN_LOCATE = 20;
    public final static int DUCK_MAX_IN_LOCATE = 200;
    public final static int EAGLE_MAX_IN_LOCATE = 20;
    public final static int FOX_MAX_IN_LOCATE = 30;
    public final static int GOAT_MAX_IN_LOCATE = 140;
    public final static int HORSE_MAX_IN_LOCATE = 20;
    public final static int MOUSE_MAX_IN_LOCATE = 500;
    public final static int RABBIT_MAX_IN_LOCATE = 150;
    public final static int SHEEP_MAX_IN_LOCATE = 140;
    public final static int WOLF_MAX_IN_LOCATE = 30;
    public final static int BOAR_MAX_IN_LOCATE = 50;
    public final static int PLANTS_MAX_IN_LOCATE = 200;

    public static  Map <CREATURE_TYPE, Creature> creature_typeAnimalMap = new HashMap<>();


    static {
        creature_typeAnimalMap.put(CREATURE_TYPE.WOLF, (Creature) (Object)CREATURE_TYPE.WOLF);
        creature_typeAnimalMap.put(CREATURE_TYPE.FOX, (Creature) (Object)CREATURE_TYPE.FOX);
        creature_typeAnimalMap.put(CREATURE_TYPE.EAGLE, (Creature) (Object)CREATURE_TYPE.EAGLE);
        creature_typeAnimalMap.put(CREATURE_TYPE.BOA, (Creature) (Object)CREATURE_TYPE.BOA);
        creature_typeAnimalMap.put(CREATURE_TYPE.BEAR, (Creature) (Object)CREATURE_TYPE.BEAR);
        creature_typeAnimalMap.put(CREATURE_TYPE.SHEEP, (Creature) (Object)CREATURE_TYPE.SHEEP);
        creature_typeAnimalMap.put(CREATURE_TYPE.RABBIT, (Creature) (Object)CREATURE_TYPE.RABBIT);
        creature_typeAnimalMap.put(CREATURE_TYPE.MOUSE, (Creature) (Object)CREATURE_TYPE.MOUSE);
        creature_typeAnimalMap.put(CREATURE_TYPE.HORSE, (Creature) (Object)CREATURE_TYPE.HORSE);
        creature_typeAnimalMap.put(CREATURE_TYPE.GOAT, (Creature) (Object)CREATURE_TYPE.GOAT);
        creature_typeAnimalMap.put(CREATURE_TYPE.DUCK, (Creature) (Object)CREATURE_TYPE.DUCK);
        creature_typeAnimalMap.put(CREATURE_TYPE.DEER, (Creature) (Object)CREATURE_TYPE.DEER);
        creature_typeAnimalMap.put(CREATURE_TYPE.CATERPILLAR, (Creature) (Object)CREATURE_TYPE.CATERPILLAR);
        creature_typeAnimalMap.put(CREATURE_TYPE.BUFFALO, (Creature) (Object)CREATURE_TYPE.BUFFALO);
        creature_typeAnimalMap.put(CREATURE_TYPE.BOAR, (Creature) (Object)CREATURE_TYPE.BOAR);
        creature_typeAnimalMap.put(CREATURE_TYPE.PLANT, (Creature) (Object)CREATURE_TYPE.PLANT);


    }

}
