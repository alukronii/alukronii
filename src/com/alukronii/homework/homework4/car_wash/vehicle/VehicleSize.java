package com.alukronii.homework.homework4.car_wash.vehicle;

public class VehicleSize {
    private double width;
    private double height;
    private double length;
    public VehicleSize(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
