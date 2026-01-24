package ru.otus.java.basic;

public class Main {

    public static void main( String[] args ) {

        Cat[] cats = {
                new Cat( "Борис" , 10 ),
                new Cat(  "Мурзик",   5  ),
                new Cat("Барсик" , 15)
        };


        Plate plate = new Plate( 20 );



        for ( Cat cat  :  cats ) {
            cat.eat( plate );
        }



        System.out.println(   "  -------- " );

        for ( Cat cat : cats ) {
            System.out.println( cat );
        }

        System.out.println( plate );
    }
}