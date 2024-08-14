package com.alukronii.homework.homework3.factory.phone;

public class Iphone extends Phone{

    public Iphone(Processor processor1, Processor processor2, Camera camera, Body body) {
        super(processor1, processor2, camera, body);
    }

    @Override
    public void takePhoto() {
        super.takePhoto();
    }

    public void printInfo() {
        System.out.println("Характеристики Iphone: \n" +
                "\" 1 Процессор с частотой: " + getProcessor1() + " МГц \" \n" +
                "\" 2 Процессор с частотой: " + getProcessor2() + " МГц \" \n" +
                "\" Камера: " + getCamera() + " МП \" \n" +
                "\" Корпус ш*в*д: " + getBody() + " мм \" \n");
    }
}
