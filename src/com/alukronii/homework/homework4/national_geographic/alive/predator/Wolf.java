package com.alukronii.homework.homework4.national_geographic.alive.predator;

import com.alukronii.homework.homework4.national_geographic.alive.DeadException;
import com.alukronii.homework.homework4.national_geographic.alive.Alive;

public class Wolf extends Predator {

    public Wolf(double weight) {
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
    public void toAttack(Alive animal) throws DeadException {
        super.toAttack(animal);
    }
}
