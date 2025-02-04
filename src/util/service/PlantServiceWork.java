package util.service;

import entity.Island;
import entity.creature.factory.CREATURE_TYPE;
import entity.creature.factory.Factory;
import entity.creature.plant.Plant;

public class PlantServiceWork implements Runnable {
    public PlantServiceWork(Island island) {
        this.island = island;
    }

    //остров или локоция
    Island island;

    @Override
    public void run() {
//        новый день на локации
        for (int g = 0; g < island.locations.length; g++) {
            for (int t = 0; t < island.locations[g].length; t++) {
                ((Plant) new Factory().create(CREATURE_TYPE.PLANT)).grassGrowth(island.locations[g][t]);
            }
        }
    }
}
