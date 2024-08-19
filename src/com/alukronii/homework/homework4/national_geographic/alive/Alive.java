package com.alukronii.homework.homework4.national_geographic.alive;

public abstract class Alive {
    private boolean isAlive = true;
    private double weight;

    public Alive(double weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void toDie () {
        setAlive(false);
    }
}
