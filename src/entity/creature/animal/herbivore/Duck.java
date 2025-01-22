package entity.creature.animal.herbivore;

import Settings.SettigsAnimal;
import entity.creature.Creature;

public class Duck extends Herbivore{


    public Duck(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public void die() {

    }

    @Override
    public void eat(Creature c) {

    }

    @Override
    public void move() {

    }

    @Override
    public Creature reproduce() {
        return super.reproduce();
    }
}
