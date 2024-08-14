package com.alukronii.homework.homework3.factory;

public class IphoneFactory {

    Processor processor1 = new Processor(1500);
    Processor processor2 = new Processor(1500);
    Camera camera = new Camera(8);
    Body body = new Body(60, 200, 10);

    Iphone iphone = new Iphone(processor1, processor2, camera, body);


}
