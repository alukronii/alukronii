package com.alukronii.homework.homework3.city;

import java.util.Arrays;

public final class City {
    private final String cityName;
    private final House[] houses;

    public String getCityName() {
        return cityName;
    }

    public House[] getHouses() {
        return houses;
    }

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = houses;

    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", houses=" + Arrays.toString(houses.clone()) +
                '}';
    }
}
