package oop_basics.access_specifiers;

public class BankAccount {
    public String accountHolder; //accessible to any class or package
    private double balance = 999.99; //accessible to BankAccount class only

    //accessible in subclasses and same package
    protected void showBalance(){
        System.out.printf("Your current balance is: %f%n", balance);
    }

    //accessible within package
    void sayHello(){
        System.out.printf("Hello, %s%n", accountHolder);
    }; 
}