package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.Creature;

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
//    енам жертв
    @Override
    public void eat(Creature c) {
//        передать сюда то что он может есть и рандомом определить что именно, далее выяснить  сьел ли он это

    }

    @Override
    public void die() {
//        выпилиться из локации
    }


}
