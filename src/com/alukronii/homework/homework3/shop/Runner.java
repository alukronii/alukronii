package com.alukronii.homework.homework3.shop;

public class Runner {
    public static void main(String[] args) {

        Customer customer = new Customer("Richard");
        Shop shop = new Shop(true, true, 3);
        customer.checkShop(shop);
    }
}