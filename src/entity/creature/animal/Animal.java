package entity.creature.animal;

import entity.creature.Creature;

public abstract class Animal extends Creature
        implements  Moveble, Dieble, Eateble, Reproduceble{

    // ОБЩИЕ ХАРАКТЕРИСТИКИ
    // СЫТОСТЬ = сколько может съесть
    int satiety;
    // ВЕС ЖИВОТНОГО
    int weight;
    // СКОРОСТЬ ПЕРЕМЕЩЕНИЯ
    int travelRange;

    public Animal(int satiety, int weight, int travelRange) {
        this.satiety = satiety;
        this.weight = weight;
        this.travelRange = travelRange;
    }

    void decreaseWeight(){
    }
}
