package com.alukronii.homework.homework3.factory.phone;

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

    @Override
    public String toString() {
        return Integer.toString(width) + " * " +
                Integer.toString(height) + " * " +
                Integer.toString(length);
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
