package ru.otus.java.basic;

public class Cat {

    private String   name;
    private int appetite;

    private boolean   isHungry;



    public Cat( String name  , int appetite ) {
        this.name = name;
        this.appetite =  appetite;
        isHungry  = true;
    }



    public void eat(   Plate plate   ) {

        if ( isHungry ) {

            System.out.println(" кот   начал  есть : " + name );

             boolean f  =  plate.decreaseFood( appetite );

             if ( f ) {
                   isHungry = false;
            }

         } else  {

            System.out.println(" кот   не   голоден : " + name );
         }
    }



    @Override
    public String toString() {
        return "Кот{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", isHungry=" + isHungry +
                '}';
    }
}