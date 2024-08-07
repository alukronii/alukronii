package com.alukronii.homework.homework2.office;

public class Manager {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Manager(String name) {
        this.name = name;
    }

    public String shout () {
        return this.name + " говорит: Я ничего не успеваю, помогите!";
    }
}
