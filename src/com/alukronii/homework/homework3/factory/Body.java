package com.alukronii.homework.homework3.factory;

public class Body {
    //Корпус: свойства - размеры - ширина, высота, длина
    private int width;
    private int height;
    private int length;

    public Body(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
