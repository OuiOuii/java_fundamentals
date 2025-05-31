package oop_basics.constructor;

public class Car {
    //The constructors are overloaded in this demo

    //this is a no-argument constructor
    Car(){
        System.out.println("Default car created.");
    }

    //this is a paremeterized constructor 
    Car(String brand, int year){
        System.out.println("===== CAR INFO =====");
        System.out.printf("Brand: %s%n", brand);
        System.out.printf("Year: %s%n", year);
        System.out.println("====================");
    }
}
