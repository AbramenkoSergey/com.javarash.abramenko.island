package entity.creature.factory;

import Settings.Settings;
import entity.creature.Creature;
import entity.creature.animal.herbivore.*;
import entity.creature.animal.predator.*;
import entity.creature.plant.Plant;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    public Map<CREATURE_TYPE,Class<?  extends Creature>> mapFactory = new HashMap<>();

    public Factory (){
        mapFactory.put(CREATURE_TYPE.BEAR, Bear.class);
        mapFactory.put(CREATURE_TYPE.BOA, Boa.class);
        mapFactory.put(CREATURE_TYPE.EAGLE, Eagle.class);
        mapFactory.put(CREATURE_TYPE.FOX, Fox.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.BOAR, Boar.class);
        mapFactory.put(CREATURE_TYPE.BUFFALO, Buffalo.class);
        mapFactory.put(CREATURE_TYPE.DEER, Deer.class);
        mapFactory.put(CREATURE_TYPE.DUCK, Duck.class);
        mapFactory.put(CREATURE_TYPE.GOAT, Goat.class);
        mapFactory.put(CREATURE_TYPE.HORSE, Horse.class);
        mapFactory.put(CREATURE_TYPE.MOUSE, Mouse.class);
        mapFactory.put(CREATURE_TYPE.RABBIT, Rabbit.class);
        mapFactory.put(CREATURE_TYPE.CATERPILLAR, Creature.class);
        mapFactory.put(CREATURE_TYPE.SHEEP, Sheep.class);
        mapFactory.put(CREATURE_TYPE.PLANT, Plant.class);
    }

    public Creature create(CREATURE_TYPE eff){
      return switch (eff){
           case WOLF -> new Wolf(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.WOLF));
           case FOX -> new Fox(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.FOX));
           case EAGLE -> new Eagle(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.EAGLE));
           case BOA -> new Boa(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.BOA));
           case BEAR -> new Bear(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.BEAR));
           case SHEEP -> new Sheep(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.SHEEP));
           case RABBIT -> new Rabbit(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.RABBIT));
           case MOUSE -> new Mouse(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.MOUSE));
           case GOAT -> new Goat(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.GOAT));
           case DUCK -> new Duck(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.DUCK));
           case DEER -> new Deer(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.DEER));
           case CATERPILLAR -> new Caterpillar(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.CATERPILLAR));
           case BUFFALO -> new Buffalo(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.BUFFALO));
           case BOAR -> new Boar(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.BOAR));
           case PLANT -> new Plant(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.PLANT));
           case HORSE -> new Horse(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.HORSE));

           default -> throw new RuntimeException("Type not found: " + eff );

       };
    }

}
