import Settings.Settings;
import entity.Island;
import entity.Location;
import entity.Population;
import entity.creature.Creature;
import entity.creature.animal.Animal;
import entity.creature.animal.herbivore.Sheep;
import entity.creature.animal.predator.Bear;
import entity.creature.animal.predator.Wolf;
import entity.creature.factory.CREATURE_TYPE;
import entity.creature.factory.Factory;
import entity.creature.plant.Plant;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Application {


    public static void main(String[] args) {
        // ТОЧКА СБОРКИ И СТАРТА МОЕГО ПРИЛОЖЕНИЯ

        Island island = new Island(Settings.columnsCount, Settings.rowsCount);
        try (ExecutorService executorService = Executors.newFixedThreadPool(4)) {
            sdfsf
        }




        Population population = new Population(island);
        population.printPopulation();
        System.out.println("=".repeat(100));
        for (int h = 0; h < 100; h++) {
            System.out.println(" day = " + h);

            for (int g = 0; g < island.locations.length; g++){
                for(int t = 0; t < island.locations[g].length; t++){
//                    новый день на локации
//                    ((Plant) new Factory().create(CREATURE_TYPE.PLANT)).grassGrowth(island.locations[g][t]);
                    for (int i = 0; i < island.locations[g][t].arrayAnimalInLocate.length; i++) {
                        for (int i1 = 0; i1 < island.locations[g][t].arrayAnimalInLocate[i].length; i1++) {
                            //блокировать локу в  котороу и из которую

                            //перебор всех крючей на локации.
                            Animal animal = null;
                            Creature creature = island.locations[g][t].arrayAnimalInLocate[i][i1];
                            if(creature instanceof Plant){
                                continue;
                            }else {
                                animal = ((Animal) creature);
                            }
                            if (creature instanceof  Wolf ){
                                animal.eat(island.locations[g][t]);
//                                ((Wolf) creature).reproduce(island.locations[g][t]);
                                animal.move(island,island.locations[g][t]);
                                //((Wolf) creature).reproduce(island.locations[g][t]);
                            }  if (creature instanceof  Bear ){
                                animal.eat(island.locations[g][t]);
//                                ((Bear) creature).reproduce(island.locations[g][t]);
                            }/*if (creature instanceof Plant ){
                                ((Plant) creature).grassGrowth(island.locations[g][t]);
                            }*/if (creature instanceof Sheep){
                                animal.eat(island.locations[g][t]);
                            }

                        }


                        }

                    }

                }
            Population.printPopulation();
            }
        //Population.printPopulation();
        //System.out.println(Arrays.deepToString(island.locations[0][0].arrayAnimalInLocate));




    }

    }

