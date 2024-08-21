package com.alukronii.homework.homework4.car_wash;

import com.alukronii.homework.homework4.car_wash.vehicle.Vehicle;

public class CarWash {
    private Vehicle[] vehicle;
    private int washPrice;
    private int vehicleCount;
    public CarWash() {
    }

    public int getWashPrice() {
        return washPrice;
    }

    public void setWashPrice(int washPrice) {
        this.washPrice = washPrice;
    }

    public String washCar(Vehicle[] vehicles) {
        washPrice = 0;
        vehicleCount = vehicles.length;
        for (Vehicle vehicle : vehicles) {
            if (!vehicle.isWashed()) {
                if (vehicle.getVehicleSize().getLength() > 6 && vehicle.getVehicleSize().getHeight() > 2.5 && vehicle.getVehicleSize().getWidth() > 2) {
                    washPrice += 4000;
                    vehicle.setWashed(true);
                } else {
                    washPrice += 2000;
                    vehicle.setWashed(true);
                }
            }
        }
        return toString();
    }

    @Override
    public String toString() {
        if (this.vehicleCount > 1) {
            System.out.print("Цена " + this.vehicleCount + "-ти помытых машин составляет: ");
        } else {
            System.out.print("Цена одной помытой машины составляет: ");
        }
        return washPrice + "\n";
    }
}
