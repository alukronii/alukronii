package com.alukronii.homework.homework3.factory;

public class Samsung extends Phone{

    public Samsung(Processor processor, Camera camera, Body body) {
        super(processor, camera, body);
    }

    @Override
    public void takePhoto() {
        super.takePhoto();
    }
}
