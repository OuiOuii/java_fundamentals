package oop_advance.enums;

public enum PizzaSize{
    
    SMALL(5), MEDIUM(7), LARGE(10);

    private double price;

    //a constructor is required to set a value on each enum constants.
    PizzaSize(double price){
        this.price = price;
    }

    //method to get the price of enum constant
    public double getPrice(){
        return price;
    }

    //method to check if the size is familySize(LARGE)
    public boolean isFamilySize(PizzaSize size){
        if(size == LARGE){
            return true;
        }
        return false;
    }
}