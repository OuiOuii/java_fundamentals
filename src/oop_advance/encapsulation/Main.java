package oop_advance.encapsulation;

public class Main{
    public static void main(String []args){
        BankAccount bk = new BankAccount();

        //the fields from BankAccount class is not called directly due to encapsulation.
        bk.setAccountHolderName("OuiOui");
        bk.deposit(40000);
        bk.withdraw(30000);
        bk.getAccountHolderName();
        bk.getAccountNumber();
        bk.getBalance();
    }
}