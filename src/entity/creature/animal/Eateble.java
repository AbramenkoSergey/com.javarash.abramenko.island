package entity.creature.animal;

import entity.creature.Creature;

public interface Eateble {
    // ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ
    // КТО ИМЕННО ЭТОТ Creature БУДЕТ ВЛИЯТЬ НА ФОРМАТ ПОЕДАНИЯ
    // КОГДА СТАНЕТ ПОНЯТНО КТО КОНКРЕТНО ЭТО Creature
    // МЫ МОЖЕМ ОПРЕДЕЛИТЬ ВЕРОЯТНОСТЬ ЕГО ПОЕДАНИЯ И РЕАЛИЗОВАТЬ ЭТУ ЛОГИКУ
    Creature eat();
}

