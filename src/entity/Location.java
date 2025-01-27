package entity;

import Settings.*;
import entity.creature.Creature;
import entity.creature.animal.herbivore.*;
import entity.creature.animal.predator.*;
import entity.creature.factory.CREATURE_TYPE;
import entity.creature.plant.Plant;

import java.util.HashMap;
import java.util.Map;

public class Location implements Runnable {

    // ЛОКАЦИЯ ДОЛЖНА ЗНАТЬ ТЕКУЩЕЕ КОЛ-ВО ЖИВОТНЫХ КОНКРЕТНОГО ВИДА
    // НА СЕБЕ
    // МАССИВ?


    //создать мапу с животными
    Bear[] bearsInLocate = new Bear[Settings.BEAR_MAX_IN_LOCATE];
    Boa[] boaInLocate = new Boa[Settings.BOA_MAX_IN_LOCATE];
    Boar[] boarsInLocate = new Boar[Settings.BOAR_MAX_IN_LOCATE];
    Buffalo[] buffaloInLocate = new Buffalo[Settings.BUFFALO_MAX_IN_LOCATE];
    Caterpillar[] caterpillarsInLocate = new Caterpillar[Settings.CATERPILLAR_MAX_IN_LOCATE];
    Duck[] ducksInLocate = new Duck[Settings.DUCK_MAX_IN_LOCATE];
    Eagle[] eaglesInLocate = new Eagle[Settings.EAGLE_MAX_IN_LOCATE];
    Goat[] goatsInLocate = new Goat[Settings.GOAT_MAX_IN_LOCATE];
    Mouse[] mouseInLocate = new Mouse[Settings.MOUSE_MAX_IN_LOCATE];
    Rabbit[] rabbitsInLocate = new Rabbit[Settings.RABBIT_MAX_IN_LOCATE];
    Fox[] foxesInLocate = new Fox[Settings.FOX_MAX_IN_LOCATE];
    Horse[] horsesInLocate = new Horse[Settings.HORSE_MAX_IN_LOCATE];
    Deer[] deerInLocate = new Deer[Settings.DEAR_MAX_IN_LOCATE];
    Sheep[] sheepInLocate = new Sheep[Settings.SHEEP_MAX_IN_LOCATE];
    Wolf[] wolvesInLocate = new Wolf[Settings.WOLF_MAX_IN_LOCATE];
    Plant[] plantsInLocate = new Plant[Settings.PLANTS_MAX_IN_LOCATE];


/*    Creature[][] arrayAnimalInLocate  = new Creature[][]{bearsInLocate, boaInLocate, boarsInLocate,buffaloInLocate,
            caterpillarsInLocate,ducksInLocate,eaglesInLocate, goatsInLocate,mouseInLocate,rabbitsInLocate,
            foxesInLocate,horsesInLocate,deerInLocate,sheepInLocate,wolvesInLocate,plantsInLocate};*/


    private int countUnit(Creature[] unit){
        int i = 0;
        for (int i1 = 0; i1 < unit.length; i1++) {
            if(unit[i1]!=null){
                i=i+1;
            }
        }
        return i;
    }

    public Map<String, Integer> createMapAnimalInLocate(){
        HashMap <String, Integer> animalInlLocate = new HashMap<>();

        animalInlLocate.put(String.valueOf(CREATURE_TYPE.BEAR),countUnit(bearsInLocate));
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.BOA), countUnit(boaInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.BOAR), countUnit(boarsInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.BUFFALO), countUnit(buffaloInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.CATERPILLAR), countUnit(caterpillarsInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.DUCK), countUnit(ducksInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.GOAT), countUnit(goatsInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.EAGLE), countUnit(eaglesInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.MOUSE), countUnit(mouseInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.RABBIT), countUnit(rabbitsInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.FOX), countUnit(foxesInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.HORSE), countUnit(horsesInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.DEER), countUnit(deerInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.SHEEP), countUnit(sheepInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.WOLF), countUnit(wolvesInLocate) );
        animalInlLocate.put(String.valueOf(CREATURE_TYPE.PLANT), countUnit(plantsInLocate) );

        return animalInlLocate;
    }


    @Override
    public void run() {

    }

    // ЛОКАЦИЮ ТОЖЕ НУЖНО ПРАВИЛЬНО СОЗДАТЬ -
    // ИНИЦИАЛИЗИРОВАВ ЕЕ НА СТАРТЕ КАКИМ-ТО КОЛ-ВОМ ЖИВОТНЫХ И РАСТЕНИЙ
}


