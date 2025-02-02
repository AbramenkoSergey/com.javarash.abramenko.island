package entity.creature.animal;

import Settings.SettigsAnimal;
import entity.creature.Creature;

public abstract class Animal extends Creature
        implements  Moveble, Dieble, Eateble, Reproduceble{
    protected int getSatietyPerDay() {
        return satietyPerDay;
    }



    protected void setSatietyPerDay(int satietyPerDay) {
        this.satietyPerDay = satietyPerDay;
    }

    private   int satietyPerDay = 100;

    public Animal(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    protected void satietyPerDayDecrease(){
        satietyPerDay = satietyPerDay/2;
    }

    // ОБЩИЕ ХАРАКТЕРИСТИКИ
    // СЫТОСТЬ = сколько может съесть
}
