package entity.creature.animal.predator;

import entity.creature.animal.Animal;

public abstract class Predator extends Animal {
    public Predator(int satiety, int weight, int travelRange) {
        super(satiety, weight, travelRange);
    }
}
