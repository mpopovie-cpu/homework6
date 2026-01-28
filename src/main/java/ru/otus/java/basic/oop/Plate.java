package ru.otus.java.basic.oop;

public class Plate {
    private int food;
    private int maxFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.food = maxFood;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }
}

