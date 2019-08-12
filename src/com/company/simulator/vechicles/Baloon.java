package com.company.simulator.vechicles;

import com.company.simulator.MyPrinter;
import com.company.simulator.WeatherTower;
import com.company.weather.Coordinates;

public class Baloon extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    private MyPrinter myPrinter;

    public Baloon(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
        String weather = weatherTower.getWeather(coordinates);
        String call = "Baloon#" + this.name + "(" + this.id + "): ";
        if (weather.equals("SUN")) {
            if (coordinates.getHeight() + 4 >= 100) {
                coordinates = new Coordinates(coordinates.getLongitude() + 2, coordinates.getLatitude(), coordinates.getHeight());
                MyPrinter.writetoFile(call + "Let's enjoy the good weather and take some pics.");
            }
            else if(checkHeight(coordinates.getHeight(), 0, call)) {
                coordinates = new Coordinates(coordinates.getLongitude() + 2, coordinates.getLatitude(), coordinates.getHeight() + 4);
                // Write in File something funy "Summer again";
                MyPrinter.writetoFile(call + "Let's enjoy the good weather and take some pics.");
//                System.out.println(call + "Summer again ");
            }
        } else if (weather.equals("RAIN")) {

            if (checkHeight(coordinates.getHeight(), 5, call)) {
                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 5);
                MyPrinter.writetoFile(call + " Damn you rain! You messed up my baloon.");
                //  System.out.println(call + "rain ");
            }
        } else if (weather.equals("FOG")) {
            if (checkHeight(coordinates.getHeight(), 3, call)) {
                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 3);
                MyPrinter.writetoFile(call + "Damn you fog! I can't see.");
            }

        } else if (weather.equals("SNOW")) {
            if (checkHeight(coordinates.getHeight(), 15, call)) {
                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 15);
//                System.out.println(call + "snow ");
                MyPrinter.writetoFile(call + "It's snowing. We're gonna crash.");
            }
        } else
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight());

    }

    boolean checkHeight(int height, int num, String date) {
        if ((height - num) <= 0) {
            MyPrinter.writetoFile("Tower says: " + "Baloon#" + this.name + "(" + this.id + ")" + " unregistered from weather tower.");
          //  System.out.println(date + "going to land ");
            weatherTower.unregister(this);
            return false;
        }
        return true;
    }

    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
        MyPrinter.writetoFile("Tower says: " + "Baloon#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
        //  System.out.println("ballon has been registrated ");
    }

}

