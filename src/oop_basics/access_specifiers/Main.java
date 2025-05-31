package oop_basics.access_specifiers;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.accountHolder = "Jericho";
        ba.showBalance();
        ba.sayHello();
    }
}
