package com.kodetek.mysunshineindonesia;

/**
 * Created by ASUS on 11/11/2017.
 */

public class Weather {
    private int weatherImage;
    private String weatherDate;
    private String weatherDesc;
    private  String weatherTemperature;

    public int getWeatherImage() {
        return weatherImage;
    }

    public String getWeatherDate() {
        return weatherDate;
    }

    public String getWeatherDesc() {
        return weatherDesc;
    }

    public String getWeatherTemperature() {
        return weatherTemperature;
    }

    public Weather(int weatherImage, String weatherDate, String weatherDesc, String weatherTemperature) {
        this.weatherImage = weatherImage;
        this.weatherDate = weatherDate;
        this.weatherDesc = weatherDesc;
        this.weatherTemperature = weatherTemperature;

    }
}
