package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.animal.Animal;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;

import java.util.ArrayList;

public abstract class Predator extends Animal {

    public Predator(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }
    protected int toEatPr(ArrayList list, CREATURE_TYPE type){
        CREATURE_TYPE name = RandomVictim.randomPredatorVictim(list);
        SettigsAnimal settigsAnimal = Settings.CREATURE_SETTINGS.get(type);


        return settigsAnimal.getChanceToEat().get(name);
    }
}
