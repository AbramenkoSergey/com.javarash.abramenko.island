package util.randomVictim;


import entity.creature.factory.CREATURE_TYPE;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomVictim {
    public static CREATURE_TYPE randomPredatorVictim(ArrayList<CREATURE_TYPE> list){
        return  list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }

    public static CREATURE_TYPE randomHerbivoreVictim(ArrayList list){
        if(list.size()>1){
            return (CREATURE_TYPE) list.get(ThreadLocalRandom.current().nextInt(list.size()));
        }else{
            return (CREATURE_TYPE) list.getFirst();
        }

    }
}
