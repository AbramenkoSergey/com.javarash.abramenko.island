package entity.creature.animal.herbivore;

import entity.creature.animal.Animal;

public abstract class Herbivore extends Animal {
    public Herbivore(int satiety, int weight, int travelRange) {
        super(satiety, weight, travelRange);
    }
}
