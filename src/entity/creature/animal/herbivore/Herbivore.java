package entity.creature.animal.herbivore;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;
import util.rndm.Rndm;

import java.util.ArrayList;

public abstract class Herbivore extends Animal {

    public Herbivore(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }
    protected Creature toEatHerb(ArrayList list, CREATURE_TYPE type){
        CREATURE_TYPE name = RandomVictim.randomHerbivoreVictim(list);
        SettigsAnimal settigsAnimal = Settings.CREATURE_SETTINGS.get(type);

        if (Rndm.random.nextInt(100) <= settigsAnimal.getChanceToEat().get(name)){
            return Settings.creature_typeToAnimalMap.get(name);
        }else {
            return Settings.creature_typeToAnimalMap.get(type);
        }

    }
}
