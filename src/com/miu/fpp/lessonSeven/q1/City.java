package com.miu.fpp.lessonSeven.q1;

public class City implements Comparable {
    private String cityName;
    private double temperature;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public City(String cityName, double temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        City city = (City) o;
        if (temperature < city.temperature) {
            return -1;
        } else if (temperature > city.temperature) {
            return 1;
        } else {
            return 0;
        }

    }
}
