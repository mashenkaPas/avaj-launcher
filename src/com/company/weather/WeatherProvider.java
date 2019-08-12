package com.company.weather;

import java.util.Random;

public final class WeatherProvider {
private static WeatherProvider weatherProvider = new WeatherProvider();
private String[] weather =  {"RAIN", "FOG", "SUN", "SNOW"};

private WeatherProvider(){

}

public static  WeatherProvider getWeatherProvider(){
    if(weatherProvider != null)
            return weatherProvider;
    else
        return  new WeatherProvider();
}

public  String getCurrentWeather( Coordinates coordinates){

    Random r = new Random();
    int weather_int = r.nextInt(4)+0;
    //sSystem.out.println(weather_int);
    return weather[weather_int];
}

}
