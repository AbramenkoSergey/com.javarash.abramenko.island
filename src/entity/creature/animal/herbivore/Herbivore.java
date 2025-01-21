package entity.creature.animal.herbivore;

import entity.creature.animal.Animal;

public abstract class Herbivore extends Animal {
    public Herbivore(double satiety, double weight, int travelRange) {
        super(satiety, weight, travelRange);
    }
}
