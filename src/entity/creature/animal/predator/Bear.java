package entity.creature.animal.predator;

import entity.creature.Creature;

public class Bear extends Predator{
    public Bear(int satiety, int weight, int travelRange) {
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
