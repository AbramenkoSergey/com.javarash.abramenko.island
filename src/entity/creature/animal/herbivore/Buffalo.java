package entity.creature.animal.herbivore;

import settings.SettigsAnimal;
import settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;


public class Buffalo extends Herbivore{
    public Buffalo(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }
    //    буйвол


    @Override
    public void die(Location location) {
        location.removeCreature(this);
    }


    @Override
    public void eat(Location location) {
        Creature creature = toEat(Settings.buffaloVictim, CREATURE_TYPE.BUFFALO, location);
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
        toMove(CREATURE_TYPE.BUFFALO, location, island);

    }

    @Override
    public void reproduce(Location location) {
        toRepro(CREATURE_TYPE.BUFFALO, location);

    }
}
