package com.company.simulator.vechicles;

import com.company.simulator.MyPrinter;
import com.company.simulator.WeatherTower;
import com.company.weather.Coordinates;

public class Helicopter extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    public Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {
        String weather = weatherTower.getWeather(coordinates);
        String call = "Helicopter#" + this.name + "(" + this.id + "): ";

        if (weather.equals("SUN")) {
            if (coordinates.getHeight() + 2 >= 100) {
                coordinates = new Coordinates(coordinates.getLongitude() + 10, coordinates.getLatitude(), coordinates.getHeight());
                MyPrinter.writetoFile(call + "Summer again, sunny weather.");
            } else if (checkHeight(coordinates.getHeight(), 0, call)) {
                coordinates = new Coordinates(coordinates.getLongitude() + 10, coordinates.getLatitude(), coordinates.getHeight() + 2);
                MyPrinter.writetoFile(call + "Summer again, sunny weather.");
            }
        } else if (weather.equals("RAIN")) {
            if (checkHeight(coordinates.getHeight(), 0, call)) {
                coordinates = new Coordinates(coordinates.getLongitude() + 5, coordinates.getLatitude(), coordinates.getHeight());
                MyPrinter.writetoFile(call + "so rainy, please help.");
            }

        } else if (weather.equals("FOG")) {
            if (checkHeight(coordinates.getHeight(), 0, call)) {
                coordinates = new Coordinates(coordinates.getLongitude() + 1, coordinates.getLatitude(), coordinates.getHeight());
                MyPrinter.writetoFile(call + "i can't see, too fogy.");
            }

        } else if (weather.equals("SNOW")) {
            if (checkHeight(coordinates.getHeight(), 12, call)) {
                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 12);
                MyPrinter.writetoFile(call + "where is my coat,it is winter here.");
            }
        } else
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight());

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
        MyPrinter.writetoFile("Tower says: " + "Helicopter#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
        // System.out.println("helicopter has been registrated");
    }


    boolean checkHeight(int height, int check, String date) {
        if ((height - check) <= 0) {
            weatherTower.unregister(this);
            //write i am going to land
            MyPrinter.writetoFile("Tower says: " + "Helicopter#" + this.name + "(" + this.id + ")" + " unregistered from weather tower.");
            return false;
        }
        return true;
    }
}
