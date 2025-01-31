package entity;

import Settings.*;
import entity.creature.Creature;
import entity.creature.animal.herbivore.*;
import entity.creature.animal.predator.*;
import entity.creature.factory.CREATURE_TYPE;
import entity.creature.factory.Factory;
import entity.creature.plant.Plant;

import java.util.HashMap;
import java.util.Map;

public class Location {

    private Bear[] bearsInLocate = new Bear[Settings.BEAR_MAX_IN_LOCATE];
    private Boa[] boaInLocate = new Boa[Settings.BOA_MAX_IN_LOCATE];
    private Boar[] boarsInLocate = new Boar[Settings.BOAR_MAX_IN_LOCATE];
    private Buffalo[] buffaloInLocate = new Buffalo[Settings.BUFFALO_MAX_IN_LOCATE];
    private Caterpillar[] caterpillarsInLocate = new Caterpillar[Settings.CATERPILLAR_MAX_IN_LOCATE];
    private Duck[] ducksInLocate = new Duck[Settings.DUCK_MAX_IN_LOCATE];
    private Eagle[] eaglesInLocate = new Eagle[Settings.EAGLE_MAX_IN_LOCATE];
    private Goat[] goatsInLocate = new Goat[Settings.GOAT_MAX_IN_LOCATE];
    private Mouse[] mouseInLocate = new Mouse[Settings.MOUSE_MAX_IN_LOCATE];
    private Rabbit[] rabbitsInLocate = new Rabbit[Settings.RABBIT_MAX_IN_LOCATE];
    private Fox[] foxesInLocate = new Fox[Settings.FOX_MAX_IN_LOCATE];
    private Horse[] horsesInLocate = new Horse[Settings.HORSE_MAX_IN_LOCATE];
    private Deer[] deerInLocate = new Deer[Settings.DEAR_MAX_IN_LOCATE];
    private Sheep[] sheepInLocate = new Sheep[Settings.SHEEP_MAX_IN_LOCATE];
    private Wolf[] wolvesInLocate = new Wolf[Settings.WOLF_MAX_IN_LOCATE];
    private Plant[] plantsInLocate = new Plant[Settings.PLANTS_MAX_IN_LOCATE];

    public Creature[][] arrayAnimalInLocate  = new Creature[][]{bearsInLocate, boaInLocate, boarsInLocate,buffaloInLocate,
            caterpillarsInLocate,ducksInLocate,eaglesInLocate, goatsInLocate,mouseInLocate,rabbitsInLocate,
            foxesInLocate,horsesInLocate,deerInLocate,sheepInLocate,wolvesInLocate,plantsInLocate};
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


    {
        Factory factory = new Factory();
        for (int i = 0; i < bearsInLocate.length / 3; i++) {
            bearsInLocate[i] = (Bear) factory.create(CREATURE_TYPE.BEAR);
        }
        for (int i = 0; i < boaInLocate.length / 3; i++) {
            boaInLocate[i] = (Boa) factory.create(CREATURE_TYPE.BOA);
        }
        for (int i = 0; i < eaglesInLocate.length / 3; i++) {
            eaglesInLocate[i] = (Eagle) factory.create(CREATURE_TYPE.EAGLE);
        }
        for (int i = 0; i < foxesInLocate.length / 3; i++) {
            foxesInLocate[i] = (Fox) factory.create(CREATURE_TYPE.FOX);
        }

        for (int i = 0; i < wolvesInLocate.length / 3; i++) {
            wolvesInLocate[i] = (Wolf) factory.create(CREATURE_TYPE.WOLF);
        }
        for (int i = 0; i < boarsInLocate.length / 3; i++) {
            boarsInLocate[i] = (Boar) factory.create(CREATURE_TYPE.BOAR);
        }
        for (int i = 0; i < buffaloInLocate.length / 3; i++) {
            buffaloInLocate[i] = (Buffalo) factory.create(CREATURE_TYPE.BUFFALO);
        }
        for (int i = 0; i < caterpillarsInLocate.length / 3; i++) {
            caterpillarsInLocate[i] = (Caterpillar) factory.create(CREATURE_TYPE.CATERPILLAR);
        }
        for (int i = 0; i < deerInLocate.length / 3; i++) {
            deerInLocate[i] = (Deer) factory.create(CREATURE_TYPE.DEER);
        }
        for (int i = 0; i < ducksInLocate.length / 3; i++) {
            ducksInLocate[i] = (Duck) factory.create(CREATURE_TYPE.DUCK);
        }
        for (int i = 0; i < goatsInLocate.length / 3; i++) {
            goatsInLocate[i] = (Goat) factory.create(CREATURE_TYPE.GOAT);
        }
        for (int i = 0; i < horsesInLocate.length / 3; i++) {
            horsesInLocate[i] = (Horse) factory.create(CREATURE_TYPE.HORSE);
        }
        for (int i = 0; i < mouseInLocate.length / 3; i++) {
            mouseInLocate[i] = (Mouse) factory.create(CREATURE_TYPE.MOUSE);
        }
        for (int i = 0; i < rabbitsInLocate.length / 3; i++) {
            rabbitsInLocate[i] = (Rabbit) factory.create(CREATURE_TYPE.RABBIT);
        }
        for (int i = 0; i < sheepInLocate.length / 3; i++) {
            sheepInLocate[i] = (Sheep) factory.create(CREATURE_TYPE.SHEEP);
        }
        for (int i = 0; i < plantsInLocate.length / 2; i++) {
            plantsInLocate[i] = (Plant) factory.create(CREATURE_TYPE.PLANT);

        }
    }


        // ЛОКАЦИЮ ТОЖЕ НУЖНО ПРАВИЛЬНО СОЗДАТЬ -

    }// ИНИЦИАЛИЗИРОВАВ ЕЕ НА СТАРТЕ КАКИМ-ТО КОЛ-ВОМ ЖИВОТНЫХ И РАСТЕНИЙ

