package entity;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Island {

    private static int columnsCount;
    private static int rowsCount;
    public  Location[][] locations;

    public Island(int columnsCount, int rowsCount) {
        this.columnsCount = columnsCount;
        this.rowsCount = rowsCount;
        locations = new Location[columnsCount][rowsCount];
        initialisation();
    }
    private void initialisation(){
        for (int i = 0; i < locations.length; i++) {
            for (int j = 0; j < locations[i].length; j++) {
                locations[i][j] = new Location();

            }
        }
    }


//в воркера передовать  конкретную локацию


    public Location getLocationPoint(Integer x, Integer y){
        try {
            return locations[y][x];
        }catch (ArrayIndexOutOfBoundsException e){

            e.printStackTrace();
            return null;
        }

    }


}
