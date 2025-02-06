package entity.creature.animal.predator;

import settings.SettigsAnimal;
import settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;

public class Boa extends Predator{


    public Boa(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public void die(Location location) {
        location.removeCreature(this);

    }


    @Override
    public void eat(Location location) {
        Creature creature = toEat(Settings.boaVictim, CREATURE_TYPE.BOA, location);
        if (creature != null){
            if(creature == this){
//                location.removeCreature(this);
                this.die(location);
//                System.out.println("Волк помер, плак плак");
            }else{
//                System.out.println("Волк съел  " + creature.getClass().getSimpleName());
//                animal.die(location);
                location.removeCreature(creature);

            }
        }else {
//            System.out.println("Акелла промахнулся");
        }
    }

    @Override
    public void move(Island island, Location location) {
        toMove(CREATURE_TYPE.BOA, location, island);
    }

    @Override
    public void reproduce(Location location) {
        toRepro(CREATURE_TYPE.BOA, location);

    }
}
