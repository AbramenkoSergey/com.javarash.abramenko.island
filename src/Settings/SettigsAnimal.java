package Settings;

import entity.creature.factory.CREATURE_TYPE;

import java.util.Map;

public class SettigsAnimal {
    public  double weight;
    public  int travelRange;
    public double satiety;
    public Map<CREATURE_TYPE,Integer> chanceToEat;

    public double getWeight() {
        return weight;
    }

    public int getTravelRange() {
        return travelRange;
    }

    public double getSatiety() {
        return satiety;
    }

    public Map<CREATURE_TYPE, Integer> getChanceToEat() {
        return chanceToEat;
    }

    public SettigsAnimal(double weight, int travelRange, double satiety, Map<CREATURE_TYPE, Integer> chanceToEat) {
        this.weight = weight;
        this.travelRange = travelRange;
        this.satiety = satiety;
        this.chanceToEat = chanceToEat;
    }
}
