package com.alukronii.homework.homework1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Необходимо написать калькулятор. Алгоритм:
        //1. Вывести на экран: Введите первое число
        System.out.println("Введите первое число");
        //2. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
        double firstNumber = scanner.nextDouble();
        scanner.nextLine();
        //3. Вывести на экран: Введите знак операции - "+", "-", "*", "/"
        System.out.println("Введите знак операции - \"" + " +, " + "-, " + "*, " + "/ \"");
        //4. Получить текст с помощью scanner.nextLine(), сохранить его в переменную
        String signOfOperation = scanner.nextLine();
        //4. Вывести на экран: Введите второе число
        System.out.println("Введите второе число");
        //5. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
        double secondNumber = scanner.nextDouble();
        //6. В зависимости от знака операции произвести соответствующую операцию. Вывести результат на экран.
        //Если знак операции не относится к перечисленным выше, вывести - "Ошибка"
        if (signOfOperation.equals("+")) {
            System.out.println(firstNumber + secondNumber);
        } else if (signOfOperation.equals("-")) {
            System.out.println(firstNumber - secondNumber);
        } else if (signOfOperation.equals("*")) {
            System.out.println(firstNumber * secondNumber);
        } else if (signOfOperation.equals("/")) {
            System.out.println(firstNumber / secondNumber);
        } else {
            System.out.println("Ошибка");
        }
        scanner.close();
    }
}
