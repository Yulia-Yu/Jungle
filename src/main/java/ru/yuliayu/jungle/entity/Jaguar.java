package ru.yuliayu.jungle.entity;

public class Jaguar {
    private int energy = 100;
    private int health = 50;
    private final double coef_food_en = 1.5;

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getCoef_food_en() {
        return coef_food_en;
    }
}
