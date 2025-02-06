package service;

import entity.Population;

public class PopulationWorker implements Runnable{
    private int day = 1;
    public PopulationWorker(Population population) {
        this.population = population;
    }

   private Population population;

    @Override
    public void run() {

            System.out.println(day++);
            Population.printPopulation();

    }
}
