package com.alukronii.homework.homework3.shop;

/**
 * Магазин
 */
public class Shop {
    private boolean isClearFloor; //Чистый пол
    private boolean workersHasBadge; //Есть ли бейджики у сотрудников
    private int countWorkers; //Количество работников в магазине

    public void setClearFloor(boolean clearFloor) {
        isClearFloor = clearFloor;
    }

    public void setWorkersHasBadge(boolean workersHasBadge) {
        this.workersHasBadge = workersHasBadge;
    }

    public void setCountWorkers(int countWorkers) {
        this.countWorkers = countWorkers;
    }

    public boolean isClearFloor() {
        return isClearFloor;
    }

    public boolean isWorkersHasBadge() {
        return workersHasBadge;
    }

    public int getCountWorkers() {
        return countWorkers;
    }

    public Shop(boolean isClearFloor, boolean workersHasBadge, int countWorkers) {
        this.isClearFloor = isClearFloor;
        this.workersHasBadge = workersHasBadge;
        this.countWorkers = countWorkers;
    }
}