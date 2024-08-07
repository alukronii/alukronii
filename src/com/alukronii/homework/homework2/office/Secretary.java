package com.alukronii.homework.homework2.office;

public class Secretary {
    String name = "Секретарь";
    public String calmDown (Boss bossName, Manager managerName, Guard guardName) {
       return name + " говорит: " + bossName.getName() + " не волнуйтесь, " + managerName.getName()
               + " все успеет. " + guardName.getName() + " - подождите!";
    }
}