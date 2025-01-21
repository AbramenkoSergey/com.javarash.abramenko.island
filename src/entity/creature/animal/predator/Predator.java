package entity.creature.animal.predator;

import entity.creature.animal.Animal;

public abstract class Predator extends Animal {
    public Predator(double satiety, double weight, int travelRange) {
        super(satiety, weight, travelRange);
    }
}
