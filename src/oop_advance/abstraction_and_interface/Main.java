package oop_advance.abstraction_and_interface;

public class Main {
    public static void main(String []args){
        Light lt = new Light("Omni Bulb Light");
        Speaker sp = new Speaker("JBL speaker");
        Thermostat ts = new Thermostat("Thermostat");

        //display Light
        lt.showStatus();
        lt.turnOn();
        lt.turnOff();

        //display Speaker
        sp.showStatus();
        sp.turnOn();
        sp.turnOff();

        //display Thermostat
        ts.showStatus();
        ts.turnOn();
        ts.turnOff();

        //display interface static method
        Controllable.showControls();
    }
}
