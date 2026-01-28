package ru.otus.java.basic.oop;

public class Main  {

        public  static void main(String[] args) {

            Plate plate = new Plate(20);

            Cat[] cats = {
                    new Cat("Барсик ",  5),
                    new  Cat("Мурзик", 10),
                    new   Cat("Рыжик", 8)
             } ;

             for  (Cat cat : cats) {
                 cat.eat(plate);
                plate.info();
             }
        }


   }
