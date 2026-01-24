package ru.otus.java.basic;


public class Plate {

    private int food;
    private int  maxFood;



    public Plate( int maxFood ) {

        this.maxFood = maxFood;
        this.food = maxFood;   //  тарелка   сразу   полная
    }



    public boolean decreaseFood( int i ) {

        if ( food - i < 0 ) {
            return false;
        } else {
            food -= i;
            return true;
        }
    }



    public void increaseFood( int i ) {

        food += i;

        if ( food > maxFood ) {
            food = maxFood;
        }
    }



    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                ", maxFood=" + maxFood +
                '}';
    }
}
