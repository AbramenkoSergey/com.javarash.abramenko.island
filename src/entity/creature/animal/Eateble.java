package entity.creature.animal;

import entity.Location;
import entity.creature.Creature;
import entity.creature.factory.CREATURE_TYPE;

import java.util.ArrayList;

public interface Eateble {
    // ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ
    // КТО ИМЕННО ЭТОТ Creature БУДЕТ ВЛИЯТЬ НА ФОРМАТ ПОЕДАНИЯ
    // КОГДА СТАНЕТ ПОНЯТНО КТО КОНКРЕТНО ЭТО Creature
    // МЫ МОЖЕМ ОПРЕДЕЛИТЬ ВЕРОЯТНОСТЬ ЕГО ПОЕДАНИЯ И РЕАЛИЗОВАТЬ ЭТУ ЛОГИКУ
    void eat(Location loca);
}

