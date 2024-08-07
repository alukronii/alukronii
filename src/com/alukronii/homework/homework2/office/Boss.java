package com.alukronii.homework.homework2.office;

public class Boss {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Boss(String name) {
        this.name = name;
    }

    public String hurryUp (Manager managerName) {
        return this.name + " говорит: " + managerName.getName() + " быстрее!";
    }
}

