package com.alukronii.homework.homework3.factory;

abstract class Phone {
    //Создать телефон Samsung, который состоит из процессора, камеры, корпуса.
    //Умеет фотографировать используя камеру (печать в консоль - "сделано фото")
    //
    //Создать телефон Iphone, который состоит из двух процессоров, камеры, корпуса.
    //Умеет фотографировать используя камеру (печать в консоль - "сделано фото").
    //Умеет печатать на экран информацию о процессорах.
    Processor processor1;
    Processor processor2;
    Camera camera;
    Body body;

    public  Phone(Processor processor, Camera camera, Body body) {
        this.processor1 = processor;
        this.camera = camera;
        this.body = body;
    }

    public Phone(Processor processor1, Processor processor2, Camera camera, Body body) {
        this.processor1 = processor1;
        this.processor2 = processor2;
        this.camera = camera;
        this.body = body;
    }

    void takePhoto () {
        camera.takePhoto();
    }
}
