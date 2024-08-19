package com.alukronii.homework.homework4.car_wash.vehicle;

public abstract class Vehicle{
    private boolean isWashed;
    private VehicleSize vehicleSize;

    public Vehicle(boolean isWashed, VehicleSize vehicleSize) {
        this.isWashed = isWashed;
        this.vehicleSize = vehicleSize;
    }

    public void setWashed(boolean washed) {
        isWashed = washed;
    }

    public void setVehicleSize(VehicleSize vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public boolean isWashed() {
        return isWashed;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }
}
