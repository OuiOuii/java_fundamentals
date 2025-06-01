package oop_advance.abstraction_and_interface;

public interface Controllable {
    abstract void turnOn(); // an abstract method [needs to be overrride when implemented]

    abstract void turnOff(); // an abstract method [needs to be overrride when implemented]

    //This method can be called using interface name
    static void showControls(){
        System.out.println("All smart devices can be turned ON or OFF using the app.");
    }
}
