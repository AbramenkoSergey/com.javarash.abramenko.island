import Settings.Settings;
import entity.Island;
import entity.Population;
import entity.creature.Creature;
import entity.creature.animal.predator.Bear;
import entity.creature.animal.predator.Wolf;
import util.service.ServiceWork;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {
    public static void main(String[] args) {
        // ТОЧКА СБОРКИ И СТАРТА МОЕГО ПРИЛОЖЕНИЯ

        Island island = new Island(Settings.columnsCount, Settings.rowsCount);
        System.out.println(Arrays.deepToString(island.locations[0][0].arrayAnimalInLocate));

        Population population = new Population(island);
        population.printPopulation();
        System.out.println("=".repeat(100));
        for (int h = 0; h < 100; h++) {
            for (int g = 0; g < island.locations.length; g++){
                for(int t = 0; t < island.locations[g].length; t++){

                    for (int i = 0; i < island.locations[g][t].arrayAnimalInLocate.length; i++) {
                        for (int i1 = 0; i1 < island.locations[g][t].arrayAnimalInLocate[i].length; i1++) {


                            Creature creature = island.locations[g][t].arrayAnimalInLocate[i][i1];
                            if (creature instanceof  Wolf ){
                                ((Wolf) creature).eat(island.locations[g][t]);
                            }  if (creature instanceof  Bear ){
                                ((Bear) creature).eat(island.locations[g][t]);
                            }

                        }
                    }

                }

            }
//            for (int i = 0; i < island.locations[0][0].arrayAnimalInLocate.length; i++) {
//                for (int i1 = 0; i1 < island.locations[0][0].arrayAnimalInLocate[i].length; i1++) {
//
//
//                    Creature creature = island.locations[0][0].arrayAnimalInLocate[i][i1];
//                    if (creature instanceof  Wolf)
//                        ((Wolf) creature).eat(island.locations[0][0]);
//                }
//            }

        }
        population.printPopulation();


        //ServiceWork serviceWork = new ServiceWork(island.locations);
//        ExecutorService executorService = Executors.newFixedThreadPool(4);

        //executorService.execute();





    }
}
