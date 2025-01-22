package entity.creature;

import Settings.SettigsAnimal;

public abstract class Creature {
    double satiety;
    // ВЕС ЖИВОТНОГО = HP
    double weight;
    // СКОРОСТЬ ПЕРЕМЕЩЕНИЯ
    int travelRange;

    public Creature(SettigsAnimal settigsAnimal) {
        this.satiety = settigsAnimal.getSatiety();
        this.weight = settigsAnimal.getWeight();
        this.travelRange = settigsAnimal.getTravelRange();
    }
}
