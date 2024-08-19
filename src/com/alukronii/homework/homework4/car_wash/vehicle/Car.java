package com.alukronii.homework.homework4.car_wash.vehicle;

public class Car extends Vehicle{

    private boolean isCruiseControl;

    public Car(boolean isWashed, VehicleSize vehicleSize, boolean isCruiseControl) {
        super(isWashed, vehicleSize);
        this.isCruiseControl = isCruiseControl;
    }
}
