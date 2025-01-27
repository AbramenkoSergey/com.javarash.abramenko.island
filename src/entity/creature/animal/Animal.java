package entity.creature.animal;

import Settings.SettigsAnimal;
import entity.creature.Creature;

public abstract class Animal extends Creature
        implements  Moveble, Dieble, Eateble, Reproduceble{
    public Animal(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    // ОБЩИЕ ХАРАКТЕРИСТИКИ
    // СЫТОСТЬ = сколько может съесть
}
