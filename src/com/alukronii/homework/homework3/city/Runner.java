package com.alukronii.homework.homework3.city;

public class Runner {
    // City city = new City([{new House('Lenina', 1)}], "Мурманск");
    // System.out.println(city);
    //-- City{[House{street: Lenina, house: 1}], name: "Мурманск"}
    //House house = city.getHouses()[0];
    //house.setStreet('Kotova');
    //System.out.println(house);
    //-- House{street: Kotova, house: 1}
    //System.out.println(city);
    //-- City{House{street: Lenina, house: 1}}
    public static void main(String[] args) {
        House houseOne = new House("Wiesenstieg", 2);
        House houseTwo = new House("Wiesenstieg", 4);
        City city = new City("Glinde", new House[]{houseOne, houseTwo});

        System.out.println(city);
        houseOne.setStreetName("Eichloh");
        System.out.println(houseOne);
        System.out.println(city);
    }
}
