package com.alukronii.homework.homework4.car_wash;

public class CarWash {
    private Vehicle[] vehicle;
    private int washPrice;

    public CarWash() {
    }

    public int getWashPrice() {
        return washPrice;
    }

    public void setWashPrice(int washPrice) {
        this.washPrice = washPrice;
    }

    /*public int washCar (Vehicle vehicle) {
        if (!vehicle.isWashed()) {
            if (vehicle.getVehicleSize().getLength() > 6 && vehicle.getVehicleSize().getHeight() > 2.5 && vehicle.getVehicleSize().getWidth() > 2) {
                washPrice += 4000;
                vehicle.setWashed(true);
            } else {
                washPrice += 2000;
                vehicle.setWashed(true);
            }
        } return washPrice;
    }*/

    public String washCar (Vehicle[] vehicle) {
        washPrice = 0;
        for (Vehicle v : vehicle) {
        /*    washCar(v);
        } return washPrice;*/
            if (!v.isWashed()) {
                if (v.getVehicleSize().getLength() > 6 && v.getVehicleSize().getHeight() > 2.5 && v.getVehicleSize().getWidth() > 2) {
                    washPrice += 4000;
                    v.setWashed(true);
                } else {
                    washPrice += 2000;
                    v.setWashed(true);
                }
            }
        } return toString();
    }

    @Override
    public String toString() {
        return "CarWash{" +
                "washPrice=" + washPrice +
                '}';
    }
}
