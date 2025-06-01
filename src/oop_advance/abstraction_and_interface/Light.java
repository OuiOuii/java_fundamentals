package oop_advance.abstraction_and_interface;

//this is a subclass of Device class
public class Light extends Device implements Controllable{

    Light(String name){
        super(name); //access Device superclass constructor
    }

    //override Controllable interface abstract methods
    @Override
    public void turnOff() {
        System.out.printf("[%s] is turned off.%n%n", name);
    }

    @Override
    public void turnOn() {
        System.out.printf("[%s] is turned on.%n", name);
    }
}
