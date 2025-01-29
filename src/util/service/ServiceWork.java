package util.service;

import entity.Location;
import entity.creature.Creature;
import entity.creature.animal.Animal;

public class ServiceWork implements  Runnable{
    Location locations;

    public ServiceWork(Location[][] location) {

        this.locations = locations;
    }

    @Override
    public void run() {
        for (int i = 0; i < locations.arrayAnimalInLocate.length; i++) {
            for (int j = 0; j < locations.arrayAnimalInLocate[i].length;j++){
                Animal animal = (Animal) locations.arrayAnimalInLocate[i][j];
                //проброс того кого нужно удалить
                Creature eat = animal.eat();
                deadAnimal(eat);

                animal.move();
                animal.reproduce();
            }

        }

        //Взять массив массивов и запустить  методы всех по очереди.
        //Через анемала вытаскиваю жертву и жертву удаляю из массива


    }
    private Animal findAnimal(Animal animal){

        Animal Animal = null;
        return Animal;

    }
    private void addAnimal(Animal animal){

    }
    private void deadAnimal(Creature animal){
        for (int i = 0; i < locations.arrayAnimalInLocate.length; i++) {
            if(locations.arrayAnimalInLocate.equals(animal)){
                for (int j = locations.arrayAnimalInLocate.length;j >0;j--){
                    if(locations.arrayAnimalInLocate[i][j] != null){
                        locations.arrayAnimalInLocate[i][j]=null;
                    }

                }
            }

        }

    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }
}
