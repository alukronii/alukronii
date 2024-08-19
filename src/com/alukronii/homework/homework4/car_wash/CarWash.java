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

    public String washCar(Vehicle[] vehicle) {
        washPrice = 0;
        vehicleCount = vehicle.length;
        for (Vehicle v : vehicle) {
            if (!v.isWashed()) {
                if (v.getVehicleSize().getLength() > 6 && v.getVehicleSize().getHeight() > 2.5 && v.getVehicleSize().getWidth() > 2) {
                    washPrice += 4000;
                    v.setWashed(true);
                } else {
                    washPrice += 2000;
                    v.setWashed(true);
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
