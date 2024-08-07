package com.alukronii.homework.homework2.office;

public class Office {

    public static void workDay (Boss boss, Manager manager, Guard guard, Secretary secretary) {
        System.out.println(boss.hurryUp(manager));
        System.out.println(manager.shout());
        System.out.println(guard.beg());
        System.out.println(secretary.calmDown(boss, manager, guard));
    }
}

