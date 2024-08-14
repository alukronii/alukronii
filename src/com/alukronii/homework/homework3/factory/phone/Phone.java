package com.alukronii.homework.homework3.factory.phone;

abstract class Phone {
    //Создать телефон Samsung, который состоит из процессора, камеры, корпуса.
    //Умеет фотографировать используя камеру (печать в консоль - "сделано фото")
    //
    //Создать телефон Iphone, который состоит из двух процессоров, камеры, корпуса.
    //Умеет фотографировать используя камеру (печать в консоль - "сделано фото").
    //Умеет печатать на экран информацию о процессорах.
    private Processor processor1;
    private Processor processor2;
    private Camera camera;
    private Body body;

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

    protected Processor getProcessor1() {
        return processor1;
    }

    protected Processor getProcessor2() {
        return processor2;
    }

    protected Camera getCamera() {
        return camera;
    }

    protected Body getBody() {
        return body;
    }

    void takePhoto () {
        camera.takePhoto();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "processor1=" + processor1 +
                ", processor2=" + processor2 +
                ", camera=" + camera +
                ", body=" + body +
                '}';
    }
}
