package util.population;

import Settings.Settings;
import entity.Island;

import java.util.Map;


public class Population {
    static Island island;

    public Population(Island island) {
        Population.island = island;
    }

    static Integer sumBear = 0;
    static Integer sumBoa = 0;
    static Integer sumEagle = 0;
    static Integer sumFox = 0;
    static Integer sumWolf = 0;
    static Integer sumBoar = 0;
    static Integer sumCaterpillar = 0;
    static Integer sumBuffalo = 0;
    static Integer sumDeer = 0;
    static Integer sumDuck = 0;
    static Integer sumGoat = 0;
    static Integer sumHorse = 0;
    static Integer sumMouse = 0;
    static Integer sumRabbit = 0;
    static Integer sumSheep = 0;
    static Integer sumPlant = 0;

    public static void printPopulation() {
        countingTheSumOfAnimals();
        System.out.print(Settings.BEAR_IMAGE + " = " + getSumBear() + "|| ");
        System.out.print(Settings.BOA_IMAGE + " = " + getSumBoa() + " || ");
        System.out.print(Settings.EAGLE_IMAGE + " = " + getSumEagle() + " || ");
        System.out.print(Settings.FOX_IMAGE + " = " + getSumFox() + " || ");
        System.out.print(Settings.WOLF_IMAGE + " = " + getSumWolf() + " || \n");
        System.out.print(Settings.BOAR_IMAGE + " = " + getSumBoar() + " || ");
        System.out.print(Settings.BUFFALO_IMAGE + " = " + getSumBuffalo() + " || ");
        System.out.print(Settings.CATERPILLAR_IMAGE + " = " + getSumCaterpillar() + " || ");
        System.out.print(Settings.DEAR_IMAGE + " = " + getSumDeer() + " || ");
        System.out.print(Settings.DUCK_IMAGE + " = " + getSumDuck() + " || \n");
        System.out.print(Settings.GOAT_IMAGE + " = " + getSumGoat() + " || ");
        System.out.print(Settings.HORSE_IMAGE + " = " + getSumHorse() + " || ");
        System.out.print(Settings.MOUSE_IMAGE + " = " + getSumMouse() + " || ");
        System.out.print(Settings.RABBIT_IMAGE + " = " + getSumRabbit() + " || ");
        System.out.print(Settings.SHEEP_IMAGE + " = " + getSumSheep() + " || \n");
        System.out.println(Settings.PLANT_IMAGE + " = " + getSumPlant() + " || ");

    }

    private static void countingTheSumOfAnimals() {
//забрать мапу с Животнными и их Количеством из локейшена,
        for (int i = 0; i < island.locations.length; i++) {
            for (int m = 0; m < island.locations[i].length; m++) {

                Map<String, Integer> mapAnimalInLocate = island.locations[i][m].createMapAnimalInLocate();
                setSumBear(getSumBear() + mapAnimalInLocate.get("BEAR"));
                setSumBoa(getSumBoa() + mapAnimalInLocate.get("BOA"));
                setSumEagle(getSumEagle() + mapAnimalInLocate.get("EAGLE"));
                setSumFox(getSumFox() + mapAnimalInLocate.get("FOX"));
                setSumWolf(getSumWolf() + mapAnimalInLocate.get("WOLF"));
                setSumBoar(getSumBoar() + mapAnimalInLocate.get("BOAR"));
                setSumBuffalo(getSumBuffalo() + mapAnimalInLocate.get("BUFFALO"));
                setSumCaterpillar(getSumCaterpillar() + mapAnimalInLocate.get("CATERPILLAR"));
                setSumDeer(getSumDeer() + mapAnimalInLocate.get("DEER"));
                setSumDuck(getSumDuck() + mapAnimalInLocate.get("DUCK"));
                setSumGoat(getSumGoat() + mapAnimalInLocate.get("GOAT"));
                setSumHorse(getSumHorse() + mapAnimalInLocate.get("HORSE"));
                setSumMouse(getSumMouse() + mapAnimalInLocate.get("BEAR"));
                setSumRabbit(getSumRabbit() + mapAnimalInLocate.get("RABBIT"));
                setSumSheep(getSumSheep() + mapAnimalInLocate.get("SHEEP"));
                setSumPlant(getSumPlant() + mapAnimalInLocate.get("PLANT"));

            }

        }
    }
    private static Integer getSumBear() {
        return sumBear;
    }

    private static void setSumBear(Integer sumBear) {
        Population.sumBear = sumBear;
    }

    private static Integer getSumBuffalo() {
        return sumBuffalo;
    }

    private static void setSumBuffalo(Integer sumBuffalo) {
        Population.sumBuffalo = sumBuffalo;
    }

    private static Integer getSumBoa() {
        return sumBoa;
    }

    private static void setSumBoa(Integer sumBoa) {
        Population.sumBoa = sumBoa;
    }

    private static Integer getSumEagle() {
        return sumEagle;
    }

    private static void setSumEagle(Integer sumEagle) {
        Population.sumEagle = sumEagle;
    }

    private static Integer getSumFox() {
        return sumFox;
    }

    private static void setSumFox(Integer sumFox) {
        Population.sumFox = sumFox;
    }

    private static Integer getSumWolf() {
        return sumWolf;
    }

    private static void setSumWolf(Integer sumWolf) {
        Population.sumWolf = sumWolf;
    }

    private static Integer getSumBoar() {
        return sumBoar;
    }

    private static void setSumBoar(Integer sumBoar) {
        Population.sumBoar = sumBoar;
    }

    private static Integer getSumCaterpillar() {
        return sumCaterpillar;
    }

    private static void setSumCaterpillar(Integer sumCaterpillar) {
        Population.sumCaterpillar = sumCaterpillar;
    }

    private static Integer getSumDeer() {
        return sumDeer;
    }

    private static void setSumDeer(Integer sumDeer) {
        Population.sumDeer = sumDeer;
    }

    private static Integer getSumDuck() {
        return sumDuck;
    }

    private static void setSumDuck(Integer sumDuck) {
        Population.sumDuck = sumDuck;
    }

    private static Integer getSumGoat() {
        return sumGoat;
    }

    private static void setSumGoat(Integer sumGoat) {
        Population.sumGoat = sumGoat;
    }

    private static Integer getSumHorse() {
        return sumHorse;
    }

    private static void setSumHorse(Integer sumHorse) {
        Population.sumHorse = sumHorse;
    }

    private static Integer getSumMouse() {
        return sumMouse;
    }

    private static void setSumMouse(Integer sumMouse) {
        Population.sumMouse = sumMouse;
    }

    private static Integer getSumRabbit() {
        return sumRabbit;
    }

    private static void setSumRabbit(Integer sumRabbit) {
        Population.sumRabbit = sumRabbit;
    }

    private static Integer getSumSheep() {
        return sumSheep;
    }

    private static void setSumSheep(Integer sumSheep) {
        Population.sumSheep = sumSheep;
    }

    public static Integer getSumPlant() {
        return sumPlant;
    }

    public static void setSumPlant(Integer sumPlant) {
        Population.sumPlant = sumPlant;
    }


}
