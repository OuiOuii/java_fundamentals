package oop_basics.statics;

public class Main {
    public static void main(String []args){

        Mathtools m = new Mathtools();

        //can be accessed without object instantiation since its STATIC
        System.out.printf("Sum: %d%n", Mathtools.add(4, 5)); //returns 9
        
        //can be accessed using an instantiated object since it is NOT STATIC
        System.out.printf("Product: %d", m.multiply(4,5));
    }
}
