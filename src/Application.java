import Settings.Settings;
import entity.Island;
import util.service.ServiceWork;

public class Application {
    public static void main(String[] args) {
        // ТОЧКА СБОРКИ И СТАРТА МОЕГО ПРИЛОЖЕНИЯ

        Island island = new Island(Settings.columnsCount, Settings.rowsCount);
        ServiceWork serviceWork = new ServiceWork(island.locations);




    }
}
