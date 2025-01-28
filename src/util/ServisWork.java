package util;

import entity.Location;

import java.util.Locale;

public class ServisWork implements  Runnable{
    Location location;

    public ServisWork(Location location) {
        this.location = location;
    }

    @Override
    public void run() {

        //Взять массив массивов и запустить  методы всех по очереди.
        //Через анемала вытаскиваю жертву и жертву удаляю из массива

    }
}
