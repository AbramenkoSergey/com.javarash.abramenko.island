package entity.creature.animal.herbivore;

import settings.SettigsAnimal;
import settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;


public class Sheep extends Herbivore{


    public Sheep(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public void die(Location location) {
        location.removeCreature(this);
    }

    @Override
    public void eat(Location location) {
        Creature creature = toEat(Settings.sheepVictim, CREATURE_TYPE.SHEEP, location);
        if (creature != null){
            if(creature == this){
//                location.removeCreature(this);
                this.die(location);
//                System.out.println("Овца помер, плак плак");
            }else{
//                System.out.println("Овца съел  " + creature.getClass().getSimpleName());

                location.removeCreature(creature);

            }
        }else {
//            System.out.println("Акелла промахнулся");

        }

    }

    @Override
    public void move(Island island, Location location) {
        toMove(CREATURE_TYPE.SHEEP, location, island);

    }

    @Override
    public void reproduce(Location location) {
        toRepro(CREATURE_TYPE.SHEEP, location);

    }
}
