import Settings.SettingsIsland;
import entity.Island;

public class Application {
    public static void main(String[] args) {
        // ТОЧКА СБОРКИ И СТАРТА МОЕГО ПРИЛОЖЕНИЯ

        Island island = new Island(SettingsIsland.columnsCount, SettingsIsland.rowsCount);


    }
}
