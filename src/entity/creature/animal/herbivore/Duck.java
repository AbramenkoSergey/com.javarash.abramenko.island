package entity.creature.animal.herbivore;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;



public class Duck extends Herbivore{


    public Duck(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public void die() {

    }

    @Override
    public void eat() {
        Integer chance = this.toEatHerb(Settings.duckVictim, CREATURE_TYPE.DUCK);
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
