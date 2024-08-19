package com.alukronii.homework.homework4.national_geographic.alive.herbivorous;

import com.alukronii.homework.homework4.national_geographic.alive.DeadException;
import com.alukronii.homework.homework4.national_geographic.alive.Alive;

public abstract class Herbivorous extends Alive {
    public Herbivorous(double weight) {
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

    public void toRun () throws DeadException {
        if (this.isAlive()) {
            } else {
                throw new DeadException("Животное не может бегать.");
            }
        }
    }

    //Травоядное - умеет бегать (не определено как).
    // Но все травоядные могут бегать только в состоянии живое.
    //Иначе выдает ошибку - "Животное не может бегать".
    //

