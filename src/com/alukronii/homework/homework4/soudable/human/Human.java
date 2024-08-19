package com.alukronii.homework.homework4.soudable.human;

import com.alukronii.homework.homework4.soudable.SoundableInterface;

public class Human implements SoundableInterface {
    @Override
    public String makeSound() {
        return "Я человек.";
    }
}
