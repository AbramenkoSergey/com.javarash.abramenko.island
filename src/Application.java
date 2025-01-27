import Settings.Settings;
import entity.Island;
import util.population.Population;

public class Application {
    public static void main(String[] args) {
        // ТОЧКА СБОРКИ И СТАРТА МОЕГО ПРИЛОЖЕНИЯ

        Island island = new Island(Settings.columnsCount, Settings.rowsCount);
        Population population = new Population(island);


    }
}
