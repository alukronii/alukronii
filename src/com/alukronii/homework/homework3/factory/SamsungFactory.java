package com.alukronii.homework.homework3.factory;

public class SamsungFactory {

    Processor processor = new Processor(1000);
    Camera camera = new Camera(16);
    Body body = new Body(60, 200, 15);

    Samsung samsung = new Samsung(processor, camera, body);
}
