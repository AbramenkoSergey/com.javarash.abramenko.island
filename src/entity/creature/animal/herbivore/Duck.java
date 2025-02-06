package entity.creature.animal.herbivore;

import settings.SettigsAnimal;
import settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;


public class Duck extends Herbivore{


    public Duck(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public void die(Location location) {
        location.removeCreature(this);

    }


    @Override
    public void eat(Location location) {
        Creature creature = toEat(Settings.duckVictim, CREATURE_TYPE.DUCK, location);
        if (creature != null){
            if(creature == this){
//                location.removeCreature(this);
                this.die(location);
//                System.out.println("Овца помер, плак плак");
            }else{
//                System.out.println("Овца съел  " + creature.getClass().getSimpleName());

                location.removeCreature(creature);

            }
        }

    }

    @Override
    public void move(Island island, Location location) {
        toMove(CREATURE_TYPE.DUCK, location, island);

    }


    @Override
    public void reproduce(Location location) {
        toRepro(CREATURE_TYPE.DUCK, location);

    }
}
