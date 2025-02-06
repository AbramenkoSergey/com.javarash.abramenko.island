package entity.creature.animal.predator;

import settings.SettigsAnimal;
import settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.Creature;
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
        Creature creature = toEat(Settings.bearVictim, CREATURE_TYPE.BEAR, loca);
        if (creature != null){
            if(creature == this){
//                location.removeCreature(this);
                this.die(loca);
//                System.out.println("Медведь помер, плак плак");
            }else{
//                System.out.println("Медведь съел  " + creature.getClass().getSimpleName());
//                animal.die(location);
                loca.removeCreature(creature);

            }
        }else {
//            System.out.println("Балу промахнулся");
        }

    }

    @Override
    public void move(Island island, Location location) {
        toMove(CREATURE_TYPE.BEAR, location, island);
    }

    @Override
    public void reproduce(Location location) {

        toRepro(CREATURE_TYPE.BEAR, location);
    }
}
