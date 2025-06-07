package oop_advance.enums;

public class Main {
    public static void main(String[] args) {
        
        PizzaOrder po = new PizzaOrder();

        po.printOrder(PizzaSize.SMALL);//inputs the enum constant from PizzaSize enum
    }
}
