package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;
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
    public void move() {
//        обратиться  к масиву в локейте

    }
//    енам жертв
    @Override
    public void eat() {
//        передать сюда то что он может есть и рандомом определить что именно, далее выяснить  сьел ли он это
        CREATURE_TYPE name = RandomVictim.randomVictim(Settings.wolfVictim);
        SettigsAnimal settigsAnimal = Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.WOLF);
        Integer chanceEat = settigsAnimal.getChanceToEat().get(name);
        if (RandomVictim.victimIsDead(chanceEat)){
            //удалить жертву из массива локации

        }else{
            die();
        }
    }

    @Override
    public void die() {
//        выпилиться из локации
    }


}
