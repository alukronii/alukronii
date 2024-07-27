package com.alukronii.homework;

import java.math.BigDecimal;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        ex2();
        System.out.println("___________________________________________");
        ex3();
        System.out.println("___________________________________________");
        ex4();
        System.out.println("___________________________________________");
        advanced();
    }

    public static void ex1() {
        //Открыть класс Calc, там задание!
    }

    public static void ex2() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        //Необходимо
        //1. убрать лишние пробелы,
        //2. перевести текст в верхний регистр
        String nameWithoutSpacesInUpperCase = name.trim().toUpperCase();
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}
        if (nameWithoutSpacesInUpperCase.contains("ОВА")) {
            System.out.println("Уважаемая " + nameWithoutSpacesInUpperCase);
        } else if (nameWithoutSpacesInUpperCase.contains("ОВ")) {
            System.out.println("Уважаемый " + nameWithoutSpacesInUpperCase);
        } else {
            System.out.println("Неизвестное лицо " + nameWithoutSpacesInUpperCase);
        }
    }

    public static void ex3() {
        //У нас есть машина. В данной машине есть перечень проверок, перед запуском двигателя
        //Количество топлива
        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (
                fuel >= 10
                        &&  (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                        && !hasErrors
                        && isEngineWork
        ) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }
    }

    public static void ex4() {
        //Работа на самостоятельное изучение функций класса String.
        //Заменить в строке 'this is' на 'those are',
        //получить индекс (число) второй буквы 'o' в строке. ПОЛУЧЕНИЕ ИНДЕКСА ЧЕРЕЗ ФУНКЦИЮ!
        //Распечатать полученный индекс
        String simply = "this is simply. This is my favorite song.";
        String simplyCorrect = simply.replace("this is", "those are");
        System.out.println("Index of second \"o\" is: " + simplyCorrect.indexOf("o", simplyCorrect.indexOf("o") + 1));
    }

    /**
     * Для продвинутых!
     * Принимается только при использовании класса BigDecimal в расчетах.
     */
    public static void advanced() {
        //Задача №4
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество проданых килограм колбасы: ");
        double sausageSellWeight = sc.nextDouble();
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость(цена) 800 руб,
        BigDecimal sausageSellPrice = new BigDecimal(800);
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000 - 404 руб
        BigDecimal sausageBuyPrice;
        if (sausageSellWeight >= 2000) {
            sausageBuyPrice = BigDecimal.valueOf(404);
        } else if (sausageSellWeight >= 1000) {
            sausageBuyPrice = BigDecimal.valueOf(408);
        } else {
            sausageBuyPrice = BigDecimal.valueOf(412);
        }

        System.out.print("Введите количество проданых килограм ветчины: ");
        double hamSellWeight = sc.nextDouble();
        //Ветчина - стоимость 350 руб
        BigDecimal hamSellPrice = new BigDecimal(350);
        //себестоимость при производстве - 275 руб
        BigDecimal hamBuyPrice = new BigDecimal(275);


        System.out.print("Введите количество проданых килограм шейки: ");
        double neckSellWeight = sc.nextDouble();
        //Шейка - стоимость 500 руб
        BigDecimal neckSellPrice = new BigDecimal(500);
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб
        BigDecimal neckBuyPrice;
        if (neckSellWeight >= 500) {
            neckBuyPrice = BigDecimal.valueOf(299);
        } else {
            neckBuyPrice = BigDecimal.valueOf(311);
        }


        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        BigDecimal incomeSausage = sausageSellPrice.multiply(BigDecimal.valueOf(sausageSellWeight));
        BigDecimal incomeHam = hamSellPrice.multiply(BigDecimal.valueOf(hamSellWeight));
        BigDecimal incomeNeck = neckSellPrice.multiply(BigDecimal.valueOf(neckSellWeight));
        BigDecimal incomeCommon = incomeSausage.add(incomeHam).add(incomeNeck);
        //Расход компании считается как умношение себестоимости на количество проданных кг + миллион рублей
        BigDecimal expenseSausage = sausageBuyPrice.multiply(BigDecimal.valueOf(sausageSellWeight));
        BigDecimal expenseHam = hamBuyPrice.multiply(BigDecimal.valueOf(hamSellWeight));
        BigDecimal expenseNeck = neckBuyPrice.multiply(BigDecimal.valueOf(neckSellWeight));
        BigDecimal expenseCommon = expenseSausage.add(expenseHam).add(expenseNeck).add(BigDecimal.valueOf(1_000_000));
        //Прибыль до налогов считается как: доход - расход
        BigDecimal profitGross = incomeCommon.subtract(expenseCommon);
        //Налоги считаются так:

        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 до 2_000_000, облагается ставкой 10%
        // прибыль до налогов до 1_000_000 (включительно), облагается ставкой 8%
        BigDecimal tax;
        if (profitGross.compareTo(BigDecimal.valueOf(2_000_000)) > 0) {
            tax = profitGross.subtract(BigDecimal.valueOf(2_000_000)).multiply(BigDecimal.valueOf(0.13)).add(BigDecimal.valueOf(180_000));
        } else if (profitGross.compareTo(BigDecimal.valueOf(1_000_000)) > 0) {
            tax = profitGross.subtract(BigDecimal.valueOf(1_000_000)).multiply(BigDecimal.valueOf(0.10)).add(BigDecimal.valueOf(80_000));
        } else {
            tax = profitGross.multiply(BigDecimal.valueOf(0.08));
        }
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //1_000_000 - налог 100_000 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        //Прибыль после налогов: прибыль до налогов - налог.
        BigDecimal profitNet = profitGross.subtract(tax);
        System.out.println("___________________________________________");
        System.out.println("___________________________________________");
        System.out.println("Итоговая прибыль после вычета налогов равна: " + profitNet);
        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг - это произведено и продано
        //Ветчины 8511кг - это произведено и продано
        //Шейки 6988кг - это произведено и продано
        sc.close();
    }
}
