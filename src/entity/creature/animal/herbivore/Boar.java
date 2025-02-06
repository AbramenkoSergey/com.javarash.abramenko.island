package entity.creature.animal.herbivore;

import settings.SettigsAnimal;
import settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;


public class Boar extends Herbivore {
    public Boar(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }
    //    кабан


    @Override
    public void die(Location location) {
        location.removeCreature(this);

    }


    @Override
    public void move(Island island, Location location) {
        toMove(CREATURE_TYPE.BOAR, location, island);
    }

    @Override
    public void reproduce(Location location) {
        toRepro(CREATURE_TYPE.BOAR, location);
    }

    @Override
    public void eat(Location location) {
        Creature creature = toEat(Settings.boarVictim, CREATURE_TYPE.BOAR, location);
        if (creature != null) {
            if (creature == this) {
//                location.removeCreature(this);
                this.die(location);
//                System.out.println("Овца помер, плак плак");
            } else {
//                System.out.println("Овца съел  " + creature.getClass().getSimpleName());

                location.removeCreature(creature);

            }
        }
    }
}

