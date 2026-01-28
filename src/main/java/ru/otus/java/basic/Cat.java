package ru.otus.java.basic;

public class Cat {

    private String name;
    private int appetite;
    private boolean isHungry = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        if (isHungry) {
            System.out.println("Кот начал есть: " + name);

            if (plate.decreaseFood(appetite)) {
                isHungry = false;
            }
        } else {
            System.out.println("Кот не голоден: " + name);
        }
    }

    public boolean isHungry() {
        return isHungry;
    }
}
