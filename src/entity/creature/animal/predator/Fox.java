package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;



public class Fox extends Predator{


    public Fox(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public void die() {

    }

    @Override
    public  Creature eat() {
        return this.toEatPr(Settings.wolfVictim, CREATURE_TYPE.WOLF);
    }

    @Override
    public void move() {

    }

    @Override
    public Creature reproduce() {
        return super.reproduce();
    }
}
