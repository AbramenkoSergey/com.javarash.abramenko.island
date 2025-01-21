package entity.creature.animal.predator;

import Settings.SettingsWolf;
import entity.creature.Creature;
import entity.creature.animal.Animal;

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
