package com.alukronii.homework.homework3.factory.phone;

public class Camera {
    //Камера: умеет фотографировать. Свойство - количество мега пикселей.
    private int amountOfMegapixel;

    public Camera(int amountOfMegapixel) {
        this.amountOfMegapixel = amountOfMegapixel;
    }

    public int getAmountOfMegapixel() {
        return amountOfMegapixel;
    }

    @Override
    public String toString() {
        return Integer.toString(amountOfMegapixel);
    }

    void takePhoto () {
        System.out.println("Сделано фото");
    }
}
