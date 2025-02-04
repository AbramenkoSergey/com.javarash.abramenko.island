package entity.creature.animal.herbivore;

import Settings.SettigsAnimal;
import entity.Island;
import entity.Location;
import entity.creature.animal.Animal;
import entity.creature.factory.CREATURE_TYPE;


public class Caterpillar extends Herbivore{
    public Caterpillar(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }
    //    Гусеница


    @Override
    public void die(Location location) {

    }

    @Override
    public void eat(Location location) {


    }


    @Override
    public void move(Island island, Location location) {

    }

    @Override
    public void reproduce(Location location) {
    }
}
