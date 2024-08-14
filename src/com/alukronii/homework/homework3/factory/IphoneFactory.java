package com.alukronii.homework.homework3.factory;

import com.alukronii.homework.homework3.factory.phone.Body;
import com.alukronii.homework.homework3.factory.phone.Camera;
import com.alukronii.homework.homework3.factory.phone.Iphone;
import com.alukronii.homework.homework3.factory.phone.Processor;

public class IphoneFactory {

    private static Processor processor1 = new Processor(1500);
    private static Processor processor2 = new Processor(1500);
    private static Camera camera = new Camera(8);
    private static Body body = new Body(60, 200, 10);

    public static Iphone createSamsung () {
        Iphone iphone = new Iphone(processor1, processor2, camera, body);
        System.out.println("Телефон Iphone создан");
        return iphone;
    }
}
