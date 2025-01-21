package entity.creature.animal.herbivore;

import entity.creature.Creature;

public class Boar extends Herbivore {
    //    кабан
    public Boar(double satiety, double weight, int travelRange) {
        super(satiety, weight, travelRange);
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
