package entity.creature.animal;

import entity.creature.Creature;

public abstract class Animal extends Creature
        implements  Moveble, Dieble, Eateble, Reproduceble{

    // ОБЩИЕ ХАРАКТЕРИСТИКИ
    // СЫТОСТЬ = сколько может съесть
    double satiety;
    // ВЕС ЖИВОТНОГО
    double weight;
    // СКОРОСТЬ ПЕРЕМЕЩЕНИЯ
    int travelRange;

    public Animal(double satiety, double weight, int travelRange) {
        this.satiety = satiety;
        this.weight = weight;
        this.travelRange = travelRange;
    }

    void decreaseWeight(){
    }
}
