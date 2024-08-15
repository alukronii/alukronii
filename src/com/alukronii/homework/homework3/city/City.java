package com.alukronii.homework.homework3.city;

import java.util.Arrays;

public final class City implements Cloneable{
    private final String cityName;
    private final House[] houses;


    protected Object clone() throws CloneNotSupportedException {
        House cloned = (House) super.clone();
        cloned.setStreetName((House)cloned.getStreetName().clone());
        return cloned;
    }

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = houses;
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
