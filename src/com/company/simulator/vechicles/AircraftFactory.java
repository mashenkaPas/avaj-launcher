package com.company.simulator.vechicles;

import com.company.simulator.vechicles.Baloon;
import com.company.simulator.vechicles.Flyable;
import com.company.simulator.vechicles.Helicopter;
import com.company.simulator.vechicles.JetPlane;
import com.company.weather.Coordinates;

import java.awt.geom.FlatteningPathIterator;

public class AircraftFactory {

    public Flyable newAircraft(String type, String name, int latitude, int longitude, int height) {

        Coordinates coordinates = new Coordinates(longitude, latitude, height);
        if (type.equals("Baloon"))
            return new Baloon(name, coordinates);
//        else if ( type.equals("762D940930B38B68C8FBDC5A534BE1B7")){
//            String encode_name = MyMD5.getNameBaloon(name);
//            if (encode_name == null) {
//                System.out.println("Problem with MD5 name ");
//                System.exit(1);
//            }
////            int lat = MyMD5.getNumber(latitude);
////            int lon = MyMD5.getNumber(longitude);
////            int h = MyMD5.getNumber(height);
//        }
        else if (type.equals("JetPlane") || type.equals("554CD647D6B135F7E36AB1214C5E816A")) {
            return new JetPlane(name, coordinates);
        } else if (type.equals("Helicopter") || type.equals("2AB8B43468E8B92B0FC5C81E70E35A2D")) {
            return new Helicopter(name, coordinates);
        } else
            return null;
    }

//
//    public Flyable newAircraft(String type, String name , String lat, String lon, String hei){
//        if ( type.equals("762D940930B38B68C8FBDC5A534BE1B7")){
//            String encode_name = MyMD5.getNameBaloon(name);
//            if (encode_name == null) {
//                System.out.println("Problem with MD5 name ");
//                System.exit(1);
//            }
//            int lat = MyMD5.getNumber(latitude);
//            int lon = MyMD5.getNumber(longitude);
//            int h = MyMD5.getNumber(height);
//            return  new Baloon();
//        }
//
//    }
}
