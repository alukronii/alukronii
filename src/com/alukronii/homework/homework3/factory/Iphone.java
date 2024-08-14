package com.alukronii.homework.homework3.factory;

public class Iphone extends Phone{

    public Iphone(Processor processor1, Processor processor2, Camera camera, Body body) {
        super(processor1, processor2, camera, body);
    }

    @Override
    public void takePhoto() {
        super.takePhoto();
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "processor1=" + processor1 +
                ", processor2=" + processor2 +
                ", camera=" + camera +
                ", body=" + body +
                '}';
    }
}
