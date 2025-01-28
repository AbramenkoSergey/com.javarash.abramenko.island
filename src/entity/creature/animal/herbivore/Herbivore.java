package entity.creature.animal.herbivore;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.animal.Animal;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;

import java.util.ArrayList;

public abstract class Herbivore extends Animal {

    public Herbivore(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }
    protected int toEatHerb(ArrayList list, CREATURE_TYPE type){
        CREATURE_TYPE name = RandomVictim.randomHerbivoreVictim(list);
        SettigsAnimal settigsAnimal = Settings.CREATURE_SETTINGS.get(type);
        return settigsAnimal.getChanceToEat().get(name);
    }
}
