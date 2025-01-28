package entity.creature.animal.herbivore;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;

import static util.ToEat.toEatHerb;

public class Boar extends Herbivore {
    public Boar(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }
    //    кабан


    @Override
    public void die() {

    }

    @Override
    public void eat() {
        Integer chance = this.toEatHerb(Settings.boarVictim, CREATURE_TYPE.BOAR);
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
