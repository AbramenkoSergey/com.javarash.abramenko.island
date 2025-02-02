package entity.creature.animal.predator;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.factory.CREATURE_TYPE;
import util.rndm.RandomVictim;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Predator extends Animal {

    public Predator(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    protected Animal eatPredator(ArrayList<CREATURE_TYPE> list, CREATURE_TYPE type, Location loca) {
        /* получить список жертв, при успешной погоне жертва пробрасывается, в противном случае  выбрасываем охотника для удаления*/

        //получаем тип жертвы
        CREATURE_TYPE name = RandomVictim.randomPredatorVictim(list);
        //нужен  получаем настройки текущего животного
        SettigsAnimal settigsAnimal = Settings.CREATURE_SETTINGS.get(type);
        Animal victim = null;
        if (ThreadLocalRandom.current().nextInt(100) <= settigsAnimal.getChanceToEat().get(name)) {
            //пробрасываем жертву
            victim = loca.getVictim(name);

        } else {
            satietyPerDayDecrease();
            if(getSatietyPerDay() < 5){
                victim = this;
            }
        }
        return victim;

    }
}
