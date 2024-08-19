package com.alukronii.homework.homework4.soudable.bird;

import com.alukronii.homework.homework4.soudable.SoundableInterface;

public class Bird implements SoundableInterface {
    @Override
    public String makeSound() {
        return "Чирик.";
    }
}
