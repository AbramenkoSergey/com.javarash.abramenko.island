package entity.creature.animal.herbivore;

import entity.creature.Creature;

public class Sheep extends Herbivore{
    public Sheep(int satiety, int weight, int travelRange) {
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
    //овца
}
