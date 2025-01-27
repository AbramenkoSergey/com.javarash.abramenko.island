package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;

public class Eagle extends Predator{


    public Eagle(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    @Override
    public void die() {

    }

    @Override
    public void eat() {
        CREATURE_TYPE name = RandomVictim.randomVictim(Settings.eagleVictim);
        SettigsAnimal settigsAnimal = Settings.CREATURE_SETTINGS.get(CREATURE_TYPE.EAGLE);
        Integer chanceEat = settigsAnimal.getChanceToEat().get(name);
        if (RandomVictim.victimIsDead(chanceEat)){
            //удалить жертву из массива локации

        }else{
            die();
        }

    }

    @Override
    public void move() {

    }

    @Override
    public Creature reproduce() {
        return super.reproduce();
    }
    //орел
}
