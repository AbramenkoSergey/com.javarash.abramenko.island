package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;

public class Wolf extends Predator{


    public Wolf(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public Creature reproduce() {
        return super.reproduce();
    }

    @Override
    public void move() {
//        обратиться  к масиву в локейте

    }

    @Override
    public  Creature eat() {
        return this.toEatPr(Settings.wolfVictim, CREATURE_TYPE.WOLF);
    }

    @Override
    public void die() {

    }


}
