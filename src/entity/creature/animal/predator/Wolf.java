package entity.creature.animal.predator;

import settings.SettigsAnimal;
import settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;

public class Wolf extends Predator{


    public Wolf(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }



    @Override
    public void move(Island island, Location location) {
        //ПРОБРОСИТЬ ИСЛАНД вниз
        toMove(CREATURE_TYPE.WOLF, location, island);
    }

    @Override
    public void eat(Location location) {

        Creature creature = toEat(Settings.wolfVictim, CREATURE_TYPE.WOLF, location);
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
    public void die(Location location) {
        location.removeCreature(this);

    }

    @Override
    public void reproduce(Location location) {
        toRepro(CREATURE_TYPE.WOLF, location);
    }
}
