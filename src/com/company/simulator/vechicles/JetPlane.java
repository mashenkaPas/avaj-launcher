package com.company.simulator.vechicles;

import com.company.simulator.MyPrinter;
import com.company.simulator.WeatherTower;
import com.company.weather.Coordinates;

public class JetPlane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;

    public JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    public void updateConditions() {
        String weather = weatherTower.getWeather(coordinates);
        String call = "JetPlane#" + this.name + "(" + this.id + "): ";

        if (weather.equals("SUN")) {
            if (coordinates.getHeight() + 2 >= 100) {
                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 2, coordinates.getHeight());
                MyPrinter.writetoFile(call + "Summer again, sunny weather.");
            }
            if (checkHeight(coordinates.getHeight(), 0, call)) {
                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 10, coordinates.getHeight() + 2);
                // System.out.println(call + "Summer again ");
                MyPrinter.writetoFile(call + "Summer again, sunny weather.");
            }
        } else if (weather.equals("RAIN")) {
            if (checkHeight(coordinates.getHeight(), 0, call)) {
                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 5, coordinates.getHeight());
                // Write in File something funy "Summer again";
           //     System.out.println(call + "aaaaaaaaaaaaa RAin  ");
                MyPrinter.writetoFile(call + "so rainy, please help.");
            }
        } else if (weather.equals("FOG")) {
            if (checkHeight(coordinates.getHeight(), 0, call))
            {
                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude() + 1, coordinates.getHeight());
                MyPrinter.writetoFile(call + "i can't see, too fogy.");
            }
        } else if (weather.equals("SNOW")) {
            if (checkHeight(coordinates.getHeight(), 7, call))
            {
                coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight() - 7);
                MyPrinter.writetoFile(call +  " where is my coat,it is winter here.");
            }
            ///System.out.println(call + "Snow ");
        } else
            this.coordinates = new Coordinates(coordinates.getLongitude(), coordinates.getLatitude(), coordinates.getHeight());

    }

    boolean checkHeight(int height, int num, String date) {
        if ((height - num) <= 0) {
            weatherTower.unregister(this);
          //  System.out.println(date + "going to land ");
            //write i am going to land
            // System.out.println(date + "going to land");
            MyPrinter.writetoFile("Tower says: " + "JetPlane#" + this.name + "(" + this.id + ")" + " unregistered from weather tower.");
            return false;
        }
        return true;
    }

    public void registerTower(WeatherTower weatherTower) {

        this.weatherTower = weatherTower;
        weatherTower.register(this);
        MyPrinter.writetoFile("Tower says: " + "JetPlane#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
    }

}
