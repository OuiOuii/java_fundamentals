package oop_advance.abstraction_and_interface;

//this is a superclass but in abstract
public abstract class Device {
    String name;

    Device(String name){
        this.name = name;
    }

    //this method is used by its subclass [Speaker, Light, Thermostat]
    void showStatus(){
        System.out.printf("Device %s is ready.%n%n", name);
    }
}
