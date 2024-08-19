package com.alukronii.homework.homework4.car_wash.vehicle;

public class Bus extends Vehicle{

    private int busload;

    @Override
    public void setVehicleSize(VehicleSize vehicleSize) {
        super.setVehicleSize(vehicleSize);
    }

    public Bus(boolean isWashed, VehicleSize vehicleSize, int busload) {
        super(isWashed, vehicleSize);
        this.busload = busload;
    }
}
