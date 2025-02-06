package entity.creature;

import settings.SettigsAnimal;

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

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
