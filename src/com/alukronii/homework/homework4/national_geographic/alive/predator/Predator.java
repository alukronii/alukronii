package com.alukronii.homework.homework4.national_geographic.alive.predator;

import com.alukronii.homework.homework4.national_geographic.alive.DeadException;
import com.alukronii.homework.homework4.national_geographic.alive.Alive;

public abstract class Predator extends Alive {

    public Predator(double weight) {
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

    public void toAttack (Alive animal) throws DeadException {
        if (animal.isAlive()) {
            if (animal.getWeight() > this.getWeight()) {
                this.toDie();
            } else {
                animal.toDie();
                this.setWeight(this.getWeight() + (animal.getWeight()/3));
            }
        } else{
            throw new DeadException("Животное не может нападать.");
        }
    }
}
