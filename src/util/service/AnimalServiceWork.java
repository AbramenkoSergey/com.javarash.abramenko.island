package util.service;

import entity.Location;
import entity.creature.animal.Animal;

public class AnimalServiceWork implements  Runnable {
    Location locations;

    public AnimalServiceWork(Location locations) {
        this.locations = locations;
    }


    @Override
    public void run() {

        //определенный локейшен
        for (int i = 0; i < locations.arrayAnimalInLocate.length; i++) {
            if (locations.arrayAnimalInLocate[i].equals(Animal.class))
                for (int w = 0; w < locations.arrayAnimalInLocate[i].length; w++) {
                    Animal creature = (Animal) locations.arrayAnimalInLocate[i][w];
                    creature.eat(locations);

                    //удаляем жертву = смерть анимала
                    //если налл, то на энимале вызываем дай
                }
        }


    }
}
