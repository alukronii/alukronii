package com.alukronii.homework.homework3.factory;

public class Processor {
    //Процессор: свойство - количество вычислений в секунду (mhz)
    private int frequency;

    public Processor(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }
}
