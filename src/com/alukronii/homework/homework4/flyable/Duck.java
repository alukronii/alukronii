package com.alukronii.homework.homework4.flyable;

public class Duck implements FlyableInterface {

    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
           throw new FlyException("Ошибка: утка ранена");
        }
        System.out.println("Утка летит");
    }
}
