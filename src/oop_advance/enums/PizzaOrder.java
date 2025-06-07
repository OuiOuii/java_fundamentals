package oop_advance.enums;

public class PizzaOrder {
    

    //used PizzaSize enum as type to let the method accept PizzaSize constants
    public void printOrder(PizzaSize size){
        System.out.printf("Size: %s%n", size);
        System.out.printf("Price: $%.2f%n", size.getPrice());
        System.out.printf("Family Size: %b%n", size.isFamilySize(size));
    }

}
