package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.factory.CREATURE_TYPE;
import util.move.ToMove;
import util.rndm.RandomVictim;

public class Wolf extends Predator{


    public Wolf(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public Creature reproduce() {
        return super.reproduce();
    }

    @Override
    public void move(Integer x, Integer y) {
        ToMove toMove = new ToMove(Wolf.class, CREATURE_TYPE.WOLF);
        int range = Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.WOLF).getTravelRange();
        int i = y;
        int j = x;
        toMove.toMove(range, i, j );

    }

    @Override
    public  Creature eat() {
        return this.toEatPr(Settings.wolfVictim, CREATURE_TYPE.WOLF);
    }

    @Override
    public void die() {

    }


}
