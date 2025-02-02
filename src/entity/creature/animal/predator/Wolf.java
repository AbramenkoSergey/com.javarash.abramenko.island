package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.Island;
import entity.Location;
import entity.creature.animal.Animal;
import entity.creature.factory.CREATURE_TYPE;
import entity.creature.factory.Factory;
import util.move.ToMove;

public class Wolf extends Predator{


    public Wolf(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }



    @Override
    public void move(Integer x, Integer y, Island island) {
        //ПРОБРОСИТЬ ИСЛАНД вниз
        ToMove toMove = new ToMove(Wolf.class, CREATURE_TYPE.WOLF);
        int range = Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.WOLF).getTravelRange();

        toMove.toMove(range, x, y );

    }

    @Override
    public void eat(Location location) {

        Animal animal = eatPredator(Settings.wolfVictim, CREATURE_TYPE.WOLF, location);
        if (animal != null){
            if(animal == this){
//                location.removeCreature(this);
                this.die(location);
//                System.out.println("Волк помер, плак плак");
            }else{
//                System.out.println("Волк съел  " + animal.getClass().getSimpleName());
//                animal.die(location);
                location.removeCreature(animal);

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
    public Animal reproduce(Location location) {
        //взять

        return super.reproduce(location);
    }


}
