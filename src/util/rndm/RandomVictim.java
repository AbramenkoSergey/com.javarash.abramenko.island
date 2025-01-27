package util.rndm;


import entity.creature.factory.CREATURE_TYPE;

import java.util.ArrayList;

public class RandomVictim {
    public static CREATURE_TYPE randomPredatorVictim(ArrayList list){
        return (CREATURE_TYPE) list.get(Rndm.random.nextInt(list.size()));
    }
    public static boolean victimIsDead(Integer value){
        boolean bln = false;
        if(value<=Rndm.random.nextInt(100)){
            return true;
        }
        return bln;
    }
    public static CREATURE_TYPE randomHerbivoreVictim(ArrayList list){
        if(list.size()>1){
            return (CREATURE_TYPE) list.get(Rndm.random.nextInt(list.size()));
        }else{
            return (CREATURE_TYPE) list.getFirst();
        }

    }
}
