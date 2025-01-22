package entity;

import Settings.*;
import entity.creature.animal.herbivore.*;
import entity.creature.animal.predator.*;
import entity.creature.plant.Plant;

public class Location {

    // ЛОКАЦИЯ ДОЛЖНА ЗНАТЬ ТЕКУЩЕЕ КОЛ-ВО ЖИВОТНЫХ КОНКРЕТНОГО ВИДА
    // НА СЕБЕ
    // МАССИВ?

    Bear[] bearsInLocate = new Bear[SettingsBear.bearMaxInLocate];
    Boa[] boaInLocate = new Boa[SettingsBoa.boaMaxInLocate];
    Boar[] boarsInLocate = new Boar[SettingsBoar.boarMaxInLocate];
    Buffalo[] buffaloInLocate = new Buffalo[SettingsBuffalo.buffaloMaxInLocate];
    Caterpillar[] caterpillarsInLocate = new Caterpillar[SettingsCaterpillar.caterpillarMaxInLocate];
    Duck[] ducksInLocate = new Duck[SettingsDuck.duckMaxInLocate];
    Eagle[] eaglesInLocate = new Eagle[SettingsEagle.eagleMaxInLocate];
    Goat[] goatsInLocate = new Goat[SettingsGoat.goatMaxInLocate];
    Mouse[] mouseInLocate = new Mouse[SettingsMouse.mouseMaxInLocate];
    Rabbit[] rabbitsInLocate = new Rabbit[SettingsRabbit.rabbitMaxInLocate];
    Fox[] foxesInLocate = new Fox[SettingsFox.foxMaxInLocate];
    Horse[] horsesInLocate = new Horse[SettingsHorse.horseMaxInLocate];
    Deer[] deerInLocate = new Deer[SettingsDear.dearMaxInLocate];
    Sheep[] sheepInLocate = new Sheep[SettingsSheep.sheepMaxInLocate];
    Wolf[] wolvesInLocate = new Wolf[Settings.wolfMaxInLocate];
    Plant[] plantsInLocate = new Plant[SettingsPlants.plantsMaxInLocate];


    // ЛОКАЦИЮ ТОЖЕ НУЖНО ПРАВИЛЬНО СОЗДАТЬ -
    // ИНИЦИАЛИЗИРОВАВ ЕЕ НА СТАРТЕ КАКИМ-ТО КОЛ-ВОМ ЖИВОТНЫХ И РАСТЕНИЙ
}


