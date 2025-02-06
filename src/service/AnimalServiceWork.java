package service;

import entity.Island;
import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.herbivore.*;
import entity.creature.animal.predator.*;

import entity.creature.plant.Plant;

public class AnimalServiceWork implements  Runnable {
    Location locations;
    Island island;

    public AnimalServiceWork(Location locations, Island island) {
        this.locations = locations;
        this.island = island;
    }


    @Override
    public void run() {
        //определенный локейшен
        for (int i = 0; i < locations.arrayAnimalInLocate.length; i++) {
            for (int i1 = 0; i1 < locations.arrayAnimalInLocate[i].length; i1++) {

                Animal animal = null;
                Creature creature = locations.arrayAnimalInLocate[i][i1];
                if (creature instanceof Plant || creature == null) {
                    continue;
                } else {
                    animal = (Animal) creature;
                }
//                    NO WORK
                    animal.eat(locations);
                    animal.reproduce(locations);
                    animal.move(island, locations);
                /*if(creature instanceof Wolf){
                    ((Wolf) creature).eat(locations);
                    ((Wolf) creature).reproduce(locations);
                    ((Wolf) creature).move(island,locations);
                } else if (creature  instanceof Fox) {
                    ((Fox) creature).eat(locations);
                    ((Fox) creature).reproduce(locations);
                    ((Fox) creature).move(island,locations);
                }else if (creature  instanceof Eagle) {
                    ((Eagle) creature).eat(locations);
                    ((Eagle) creature).reproduce(locations);
                    ((Eagle) creature).move(island,locations);
                }else if (creature  instanceof Boa) {
                    ((Boa) creature).eat(locations);
                    ((Boa) creature).reproduce(locations);
                    ((Boa) creature).move(island,locations);
                }else if (creature  instanceof Bear) {
                    ((Bear) creature).eat(locations);
                    ((Bear) creature).reproduce(locations);
                    ((Bear) creature).move(island,locations);
                }else if (creature  instanceof Sheep) {
                    ((Sheep) creature).eat(locations);
                    ((Sheep) creature).reproduce(locations);
                    ((Sheep) creature).move(island,locations);
                }else if (creature  instanceof Rabbit) {
                    ((Rabbit) creature).eat(locations);
                    ((Rabbit) creature).reproduce(locations);
                    ((Rabbit) creature).move(island,locations);
                }else if (creature  instanceof Mouse) {
                    ((Mouse) creature).eat(locations);
                    ((Mouse) creature).reproduce(locations);
                    ((Mouse) creature).move(island,locations);
                }else if (creature  instanceof Horse) {
                    ((Horse) creature).eat(locations);
                    ((Horse) creature).reproduce(locations);
                    ((Horse) creature).move(island,locations);
                }else if (creature  instanceof Goat) {
                    ((Goat) creature).eat(locations);
                    ((Goat) creature).reproduce(locations);
                    ((Goat) creature).move(island,locations);
                }else if (creature  instanceof Duck) {
                    ((Duck) creature).eat(locations);
                    ((Duck) creature).reproduce(locations);
                    ((Duck) creature).move(island,locations);
                }else if (creature  instanceof Deer) {
                    ((Deer) creature).eat(locations);
                    ((Deer) creature).reproduce(locations);
                    ((Deer) creature).move(island,locations);
                }else if (creature  instanceof Caterpillar) {
                    ((Caterpillar) creature).eat(locations);
                    ((Caterpillar) creature).reproduce(locations);
                    ((Caterpillar) creature).move(island,locations);
                }else if (creature  instanceof Buffalo) {
                    ((Buffalo) creature).eat(locations);
                    ((Buffalo) creature).reproduce(locations);
                    ((Buffalo) creature).move(island,locations);
                }else if (creature  instanceof Boar) {
                    ((Boar) creature).eat(locations);
                    ((Boar) creature).reproduce(locations);
                    ((Boar) creature).move(island,locations);
                }*/

            }
        }
    }
}
