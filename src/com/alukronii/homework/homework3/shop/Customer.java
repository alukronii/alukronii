package com.alukronii.homework.homework3.shop;

/**
 * Покупатель
 */
public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer(String name) {
        this.name = name;
    }

    void checkShop(Shop shop) {
        if ((shop.getCountWorkers() > 2 && shop.isClearFloor()) ||
                (shop.isWorkersHasBadge() && shop.isClearFloor()) ||
                (shop.getCountWorkers() > 2 && shop.isWorkersHasBadge())) {
            System.out.println(getName() + ": Магазин прошел проверку");
        } else {
            System.out.println(getName() + ": Магазин не прошел проверку!");
        }
    }
}
