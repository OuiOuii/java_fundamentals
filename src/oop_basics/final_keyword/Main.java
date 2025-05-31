package oop_basics.final_keyword;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("126432");// a value is assigned to an object even though the accountNumber is final.

        System.out.println(ba1.getAccountInfo());// prints the accountNumber with final keyword
    }
}
