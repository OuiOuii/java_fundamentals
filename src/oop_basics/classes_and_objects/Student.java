package oop_basics.classes_and_objects;

public class Student {
    //these are properties
    String name;
    int age;

    //these are methods
    public void sayHello(){
        System.out.printf("Hi, Im %s and I'm %d years old.%n", name, age);
    }
}
