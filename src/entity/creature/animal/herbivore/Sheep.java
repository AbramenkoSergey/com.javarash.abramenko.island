package entity.creature.animal.herbivore;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;



public class Sheep extends Herbivore{


    public Sheep(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public void die() {

    }

    @Override
    public Creature eat() {
        return this.toEatHerb(Settings.sheepVictim,CREATURE_TYPE.SHEEP);
    }

    @Override
    public void move() {

    }

    @Override
    public Creature reproduce() {
        return super.reproduce();
    }
    //овца
}
