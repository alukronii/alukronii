package com.alukronii.homework.homework4.soudable.human;

import com.alukronii.homework.homework4.soudable.SoundableInterface;

public class Builder extends Human implements SoundableInterface {
    @Override
    public String makeSound() {
        return "Я строитель." + super.makeSound();
    }
}
