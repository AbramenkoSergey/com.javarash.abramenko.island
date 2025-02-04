package entity.creature.animal;

import entity.Location;
import entity.creature.factory.CREATURE_TYPE;
import entity.creature.factory.Factory;
import entity.creature.plant.Plant;

import java.util.concurrent.ThreadLocalRandom;

public interface Reproduceble {
     void reproduce(Location location);
}