package com.alukronii.homework.homework4.soudable;

import com.alukronii.homework.homework4.soudable.bird.Bird;
import com.alukronii.homework.homework4.soudable.human.Builder;
import com.alukronii.homework.homework4.soudable.human.Driver;
import com.alukronii.homework.homework4.soudable.human.Human;

public class Runner {
    public static void main(String[] args) {
    Human human = new Human();
    Driver driver = new Driver();
    Builder builder = new Builder();
    Bird bird = new Bird();
    SoundableInterface[] soundables = {human, driver, builder, bird};
        for (SoundableInterface soundable : soundables) {
            System.out.println(soundable.makeSound());
        }
    }
}
