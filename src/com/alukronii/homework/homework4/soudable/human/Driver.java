package com.alukronii.homework.homework4.soudable.human;

import com.alukronii.homework.homework4.soudable.SoundableInterface;

public class Driver extends Human implements SoundableInterface {
    @Override
    public String makeSound() {
        return "Я водитель.";
    }
}
