package com.alukronii.homework.homework4.car_wash;

import com.alukronii.homework.homework4.car_wash.vehicle.Bus;
import com.alukronii.homework.homework4.car_wash.vehicle.Car;
import com.alukronii.homework.homework4.car_wash.vehicle.Vehicle;
import com.alukronii.homework.homework4.car_wash.vehicle.VehicleSize;

public class Runner {
    public static void main(String[] args) {
        VehicleSize carSize = new VehicleSize(5, 2, 1.8);
        VehicleSize busSize = new VehicleSize(12,3,2.3);

        Car car1 = new Car(false, carSize, true);
        Car car2 = new Car(false, carSize, true);
        Car car3 = new Car(false, carSize, true);
        Car car4 = new Car(false, carSize, true);

        Bus bus1 = new Bus(false, busSize,12);
        Bus bus2 = new Bus(false, busSize,12);
        Bus bus3 = new Bus(false, busSize,12);
        Bus bus4 = new Bus(false, busSize,12);
        Bus bus5 = new Bus(false, busSize,12);

        Car car5 = new Car(false, carSize, true);

        CarWash carWash = new CarWash();
        System.out.println(carWash.washCar(new Vehicle[]{car1, car2, car3, car4, bus1, bus2, bus3, bus4, bus5}));
        System.out.println(carWash.washCar(new Vehicle[]{car5}));
    }
}
