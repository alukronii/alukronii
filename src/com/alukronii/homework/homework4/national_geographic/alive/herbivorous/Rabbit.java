package com.alukronii.homework.homework4.national_geographic.alive.herbivorous;

import com.alukronii.homework.homework4.national_geographic.alive.DeadException;

public class Rabbit extends Herbivorous {

    public Rabbit(double weight) {
        super(weight);
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public void setAlive(boolean alive) {
        super.setAlive(alive);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    @Override
    public void toDie() {
        super.toDie();
    }

    @Override
    public void toRun() throws DeadException {
        super.toRun();
        System.out.println("Кролик быстро бежит.");
    }
}
