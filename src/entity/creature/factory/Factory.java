package entity.creature.factory;

import Settings.Settings;
import entity.creature.Creature;
import entity.creature.animal.herbivore.*;
import entity.creature.animal.predator.*;
import entity.creature.plant.Plant;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    Map<CREATURE_TYPE,Class<?  extends Creature>> mapFactory = new HashMap<>();

    public Factory (){
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
        mapFactory.put(CREATURE_TYPE.WOLF, Wolf.class);
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
           case BOAR -> new Boar(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.FOX));
           case PLANT -> new Plant(Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.PLANT));
           default -> throw new RuntimeException("Type not found: " + eff );

       };
    }

}
