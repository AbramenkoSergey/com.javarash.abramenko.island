package service;

import entity.Population;

import java.util.concurrent.locks.ReentrantLock;

public class PopulationWorker implements Runnable {
    public PopulationWorker(Population population) {
        this.population = population;
    }

    private final ReentrantLock lock = new ReentrantLock();

    private Population population;

    @Override
    public void run() {

        Population.printPopulation();

    }
}
