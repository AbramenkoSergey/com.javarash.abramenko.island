package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.factory.CREATURE_TYPE;
import entity.creature.factory.Factory;

import java.util.concurrent.ThreadLocalRandom;


public class Fox extends Predator{


    public Fox(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public void die(Location location) {

    }


    @Override
    public void eat(Location loca) {

    }

    @Override
    public void reproduce(Location location) {
    }
}
