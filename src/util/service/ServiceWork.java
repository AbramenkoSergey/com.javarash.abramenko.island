package util.service;

import entity.Location;
import entity.creature.animal.Animal;

public class ServiceWork implements  Runnable{
    Location locations;

    public ServiceWork(Location locations) {
        this.locations = locations;
    }


    @Override
    public void run() {

        //определенный локейшен
        for (int i = 0; i < locations.arrayAnimalInLocate.length; i++) {
            if(locations.arrayAnimalInLocate[i].equals(Animal.class))
            for (int w = 0; w < locations.arrayAnimalInLocate[i].length; w++) {
                Animal creature = (Animal) locations.arrayAnimalInLocate[i][w];
                creature.eat(locations);

                //удаляем жертву = смерть анимала
                //если налл, то на энимале вызываем дай
                            }
        }




        //animal.move(j,i);
                //animal.reproduce();
                //проброс того кого нужно удалить
                //Creature eat = animal.eat();
                //deadAnimal(eat);


        //Взять массив массивов и запустить  методы всех по очереди.
        //Через анемала вытаскиваю жертву и жертву удаляю из массива
    }


/*    private void deadAnimal(Creature animal){
        for (int i = 0; i < locations.arrayAnimalInLocate.length; i++) {
            if(locations.arrayAnimalInLocate.equals(animal)){
                for (int j = locations.arrayAnimalInLocate.length;j >0;j--){
                    if(locations.arrayAnimalInLocate[i][j] != null){
                        locations.arrayAnimalInLocate[i][j]=null;
                    }
                }
            }

        }

    }*/


}
