package com.alukronii.homework.homework2.office;

public class Guard {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Guard(String name) {
        setName(name);
    }

    public String beg () {
        return this.name + " говорит: Дайте мне аванс!";
    }
}
