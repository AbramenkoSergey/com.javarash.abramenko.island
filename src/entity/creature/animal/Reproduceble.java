package entity.creature.animal;

import entity.creature.Creature;

public interface Reproduceble {
   default Creature reproduce() {
      // ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ
      return null;
   }
}
