package oop_advance.method_chaining;

public class Main {
    public static void main(String []args){
        FluentCalculator fc = new FluentCalculator().start(10).add(5).subtract(3).multiply(2).divide(3);

        System.out.printf("Result: %.1f", fc.getResult());
    }
}
