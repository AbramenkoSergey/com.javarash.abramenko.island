import settings.Settings;
import entity.Island;

import entity.Population;
import service.AnimalServiceWork;
import service.PlantServiceWork;
import service.PopulationWorker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;


public class Application {


    public static void main(String[] args) {
        // ТОЧКА СБОРКИ И СТАРТА МОЕГО ПРИЛОЖЕНИЯ

        Island island = new Island(Settings.rowsCount, Settings.columnsCount);
        PlantServiceWork plantServiceWork = new PlantServiceWork(island);

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        scheduledExecutorService.scheduleAtFixedRate(plantServiceWork,0,50, MILLISECONDS);

        PopulationWorker populationWorker = new PopulationWorker(new Population(island));


        for (int i = 0; i < Settings.SIMULATION_DAY; i++) {
            for (int g = 0; g < island.locations.length; g++) {
                for (int t = 0; t < island.locations[g].length; t++) {
                    executorService.execute(new AnimalServiceWork(island.locations[g][t], island));

                }
            }
            executorService.execute(populationWorker);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        scheduledExecutorService.shutdown();


//        Population population = new Population(island);
//        population.printPopulation();
//        System.out.println("=".repeat(100));
//        for (int h = 0; h < 100; h++) {
//            System.out.println(" day = " + h);
//
//            for (int g = 0; g < island.locations.length; g++) {
//                for (int t = 0; t < island.locations[g].length; t++) {
////                    новый день на локации
////                    ((Plant) new Factory().create(CREATURE_TYPE.PLANT)).grassGrowth(island.locations[g][t]);
//                    for (int i = 0; i < island.locations[g][t].arrayAnimalInLocate.length; i++) {
//                        for (int i1 = 0; i1 < island.locations[g][t].arrayAnimalInLocate[i].length; i1++) {
//
//                            Animal animal = null;
//                            Creature creature = island.locations[g][t].arrayAnimalInLocate[i][i1];
//                            if (creature instanceof Plant) {
//                                continue;
//                            } else {
//                                animal = ((Animal) creature);
//                            }
//                            if (creature instanceof Wolf) {
//                                animal.eat(island.locations[g][t]);
////                                ((Wolf) creature).reproduce(island.locations[g][t]);
//                                animal.move(island, island.locations[g][t]);
//                                //((Wolf) creature).reproduce(island.locations[g][t]);
//                            }
//                            if (creature instanceof Bear) {
//                                animal.eat(island.locations[g][t]);
////                                ((Bear) creature).reproduce(island.locations[g][t]);
//                            }/*if (creature instanceof Plant ){
//                                ((Plant) creature).grassGrowth(island.locations[g][t]);
//                            }*/
//                            if (creature instanceof Sheep) {
//                                animal.eat(island.locations[g][t]);
//                            }
//
//                        }
//
//
//                    }
//
//                }
//
//            }
//            Population.printPopulation();
//        }
//        //Population.printPopulation();
//        //System.out.println(Arrays.deepToString(island.locations[0][0].arrayAnimalInLocate));
    }

}

