package entity.creature.animal.predator;

import entity.creature.Creature;

public class Wolf extends Predator{
    public Wolf(int satiety, int weight, int travelRange) {
        super(satiety, weight, travelRange);
    }

    @Override
    public Creature reproduce() {
        return super.reproduce();
    }

    @Override
    public void move() {

    }

    @Override
    public void eat(Creature c) {

    }

    @Override
    public void die() {

    }
}
