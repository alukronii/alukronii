package com.alukronii.homework.homework3.factory;

import com.alukronii.homework.homework3.factory.phone.Iphone;
import com.alukronii.homework.homework3.factory.phone.Samsung;

public class Runner {
    public static void main(String[] args) {
       Samsung samsung =  SamsungFactory.createSamsung();
       samsung.takePhoto();
       Iphone iphone = IphoneFactory.createSamsung();
       iphone.takePhoto();
       iphone.printInfo();
    }
}
