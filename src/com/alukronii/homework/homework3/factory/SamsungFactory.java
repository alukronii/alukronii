package com.alukronii.homework.homework3.factory;

import com.alukronii.homework.homework3.factory.phone.Body;
import com.alukronii.homework.homework3.factory.phone.Camera;
import com.alukronii.homework.homework3.factory.phone.Processor;
import com.alukronii.homework.homework3.factory.phone.Samsung;

public class SamsungFactory {

    private static Processor processor = new Processor(1000);
    private static Camera camera = new Camera(16);
    private static Body body = new Body(60, 200, 15);


    public static Samsung createSamsung () {
        Samsung samsung = new Samsung(processor, camera, body);
        System.out.println("Телефон Samsung создан");
        return samsung;
    }



}
