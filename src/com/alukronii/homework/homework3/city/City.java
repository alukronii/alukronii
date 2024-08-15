package com.alukronii.homework.homework3.city;

import java.util.Arrays;

public class City implements Cloneable{
    private String cityName;
    private House[] houses;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = houses;
    }

    public City (City newCityCopy) throws CloneNotSupportedException {
        this(newCityCopy.getCityName(), newCityCopy.getHouses().clone());
    }

    public String getCityName() {
        return cityName;
    }

    public House[] getHouses() {
        return houses;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", houses=" + Arrays.toString(houses) +
                '}';
    }
}
