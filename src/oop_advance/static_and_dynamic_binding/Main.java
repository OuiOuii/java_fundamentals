package oop_advance.static_and_dynamic_binding;

public class Main {
    public static void main(String []args){
        Shape sh;

        sh = new Circle();
        System.out.printf("Result: %f%n", sh.area(5));

        sh = new Square();
        System.out.printf("Result: %f%n", sh.area(5));
    }
}
