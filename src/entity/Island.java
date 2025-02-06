package entity;

import settings.Settings;

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


    public Location getLocation(Integer x, Integer y){
        try {
            return locations[y][x];
        }catch (ArrayIndexOutOfBoundsException e){

            //e.printStackTrace();
            return null;
        }

    }
    public int getLocationX(Location location) {
        for (int i = 0; i < Settings.rowsCount; i++) {
            for (int j = 0; j < Settings.columnsCount; j++) {
                if (locations[i][j].equals(location)) {
                    return j;
                }
            }
        }
        return -1;
    }
    public int getLocationY(Location location) {
        for (int i = 0; i < Settings.rowsCount; i++) {
            for (int j = 0; j < Settings.columnsCount; j++) {
                if (locations[i][j].equals(location)) {
                    return i;
                }
            }
        }
        return -1;
    }


}
