package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.factory.CREATURE_TYPE;

public class Bear extends Predator{


    public Bear(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public void die(Location location) {
        location.removeCreature(this);

    }


    @Override
    public void eat(Location loca) {
        Animal animal = eatPredator(Settings.bearVictim, CREATURE_TYPE.BEAR, loca);
        if (animal != null){
            if(animal == this){
//                location.removeCreature(this);
                this.die(loca);
//                System.out.println("Медведь помер, плак плак");
            }else{
//                System.out.println("Медведь съел  " + animal.getClass().getSimpleName());
//                animal.die(location);
                loca.removeCreature(animal);

            }
        }else {
//            System.out.println("Балу промахнулся");
        }

    }

    @Override
    public void move(Integer x, Integer y, Island island) {

    }
}
