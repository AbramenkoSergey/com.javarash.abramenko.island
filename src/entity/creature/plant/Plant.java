package entity.creature.plant;

import settings.SettigsAnimal;
import entity.Location;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;
import entity.creature.factory.Factory;


public class Plant extends Creature {

    public Plant(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    // РОСТ РАСТЕНИЙ
    public void grassGrowth(Location location) {
        Factory factory = new Factory();
        for (int i = 0; i < location.arrayAnimalInLocate.length; i++) {
            //ищем подходящий массив
            if (location.arrayAnimalInLocate[i].getClass().getSimpleName().toUpperCase().contains(Plant.class.getSimpleName().toUpperCase())) {
                //заполнить массив с травой 25 раз если не нал и есть место в массиве
                for (int a = 0, count = 25; a < location.arrayAnimalInLocate[i].length; a++, count--) {

                    if (location.arrayAnimalInLocate[i][a] == null && count > 0) {//count > 0
                        location.arrayAnimalInLocate[i][a] = factory.create(CREATURE_TYPE.PLANT);

                    }
                }
                //System.out.println("Выростили 25 травы");

            }
        }

    }

}
