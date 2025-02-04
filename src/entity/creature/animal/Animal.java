package entity.creature.animal;

import Settings.SettigsAnimal;
import Settings.Settings;
import entity.Location;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;
import entity.creature.factory.Factory;

import util.rndm.RandomVictim;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal extends Creature
        implements  Moveble, Dieble, Eateble, Reproduceble{
    protected int getSatietyPerDay() {
        return satietyPerDay;
    }

    protected void setSatietyPerDay(int satietyPerDay) {
        this.satietyPerDay = satietyPerDay;
    }

    private   int satietyPerDay = 100;

    public Animal(SettigsAnimal settigsAnimal) {
        super(settigsAnimal);
    }

    protected void satietyPerDayDecrease(){
        satietyPerDay = satietyPerDay/2;
    }
    protected void satietyPerDaySetBackValue(){
        satietyPerDay = 100;
    }

    @Override
    public void move(Integer x, Integer y) {
        /*1)получить остров
        * 2)проверить можно ли переместить животное в эту локацию
        * 2.1 если да, удалить в старой и создать в новой
        * 2.2 если нет, ничего не делать*/
    }

    protected Creature toEat(ArrayList<CREATURE_TYPE> list, CREATURE_TYPE type, Location loca) {
        /* получить список жертв, при успешной погоне жертва пробрасывается, в противном случае  выбрасываем охотника для удаления*/

        //получаем тип жертвы
        CREATURE_TYPE name = RandomVictim.randomHerbivoreVictim(list);
        //нужен  получаем настройки текущего животного
        SettigsAnimal settigsAnimal = Settings.CREATURE_SETTINGS.get(type);
        Creature victim = null;
        if (ThreadLocalRandom.current().nextInt(101) <= settigsAnimal.getChanceToEat().get(name)) {
            //пробрасываем жертву
            victim = loca.getVictim(name);
            //satietyPerDaySetBackValue();
            //

        }
        if (victim == null) {
            satietyPerDayDecrease();
            if (getSatietyPerDay() < 20) {
                victim = this;
            }
        }
        return victim;

    }

    protected void toRepro(CREATURE_TYPE creatureType, Location location){

//        Animal Animal = null;
        Class<? extends Creature> type = Settings.creatureTypeClassMap.get(creatureType);
        if(location.findAnimalForRepro(type)){
            for (int i = 0; i < location.arrayAnimalInLocate.length; i++) {
//            //ищем подходящий массив
                if (location.arrayAnimalInLocate[i].getClass().getSimpleName().toUpperCase().contains(type.getSimpleName().toUpperCase())) {
                    for (int a = 0; a < location.arrayAnimalInLocate[i].length; a++) {
                        if (ThreadLocalRandom.current().nextInt(0, 2) == 1 && location.arrayAnimalInLocate[i][a] == null) {
                            location.arrayAnimalInLocate[i][a] = new Factory().create(creatureType);
                            System.out.println(type.getSimpleName().toUpperCase() +" я родился");
                        }
                    }
                }else{
//                    System.out.println(Settings.creatureTypeClassMap.get(creatureType).getSimpleName()+" не смог спариться");
//                    System.out.println(creatureType.getClass().getSimpleName().toUpperCase());
//                    System.out.println(location.arrayAnimalInLocate[i].getClass().getSimpleName().toUpperCase());

                }

            }
        }else{
//            System.out.println(Settings.creatureTypeClassMap.get(creatureType).getSimpleName()+" не с кем спариваться");
        }


    }
}
