package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;

public class Bear extends Predator{


    public Bear(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public void die() {

    }

    @Override
    public void eat() {
        Integer chance = this.toEatPr(Settings.bearVictim,CREATURE_TYPE.BEAR);
        if (RandomVictim.victimIsDead(chance)){
            //удалить жертву из массива локации

        }else{
            die();
        }

    }

    @Override
    public void move() {

    }

    @Override
    public Creature reproduce() {
        return super.reproduce();
    }
}
