package com.alukronii.homework.homework2.office;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        Guard guard = new Guard("Петрович");
        Secretary secretary = new Secretary();

        Office.workDay(boss,manager,guard,secretary);
    }
}
