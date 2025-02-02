package entity.creature.animal;

import entity.Location;
import entity.creature.Creature;

public interface Reproduceble {
   default Animal reproduce(Location location) {
      // ДЕФОЛТНАЯ РЕАЛИЗАЦИЯ
      return null;
   }
}
