package util;
import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;

import java.util.ArrayList;

public class ToEat {
//    public static int toEatPr(ArrayList list, CREATURE_TYPE type){
//        CREATURE_TYPE name = RandomVictim.randomPredatorVictim(list);
//        SettigsAnimal settigsAnimal = Settings.CREATURE_SETTINGS.get(type);
//
//
//        return settigsAnimal.getChanceToEat().get(name);
//    }
    public static int toEatHerb(ArrayList list, CREATURE_TYPE type){
        CREATURE_TYPE name = RandomVictim.randomHerbivoreVictim(list);
        SettigsAnimal settigsAnimal = Settings.CREATURE_SETTINGS.get(type);
        return settigsAnimal.getChanceToEat().get(name);
    }


}
