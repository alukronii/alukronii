package com.alukronii.homework.homework4.flyable;

public class Runner {
    public static void main(String[] args) {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Airplane airplane1 = new Airplane(10);
        Airplane airplane2 = new Airplane(-1);

        FlyableInterface[] flyableInterfaces = {duck1, duck2, airplane1, airplane2};
        for (FlyableInterface flyableInterface : flyableInterfaces) {
            try {
                flyableInterface.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
