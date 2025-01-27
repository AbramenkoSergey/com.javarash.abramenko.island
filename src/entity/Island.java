package entity;

public class Island {

    private static int columnsCount;
    private static int rowsCount;

    public Island(int columnsCount, int rowsCount) {
        this.columnsCount = columnsCount;
        this.rowsCount = rowsCount;
    }

    public  Location[][] locations = new Location[columnsCount][rowsCount];

}
