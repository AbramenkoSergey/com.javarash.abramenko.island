package entity.creature.animal.herbivore;

import Settings.SettigsAnimal;
import entity.Island;
import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;


public class Buffalo extends Herbivore{
    public Buffalo(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }
    //    буйвол


    @Override
    public void die(Location location) {

    }


    @Override
    public void eat(Location loca) {

    }

    @Override
    public void move(Integer x, Integer y, Island island) {

    }

    @Override
    public Animal reproduce(Location location) {
        return super.reproduce(location);
    }
}
