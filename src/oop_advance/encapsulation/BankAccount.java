package oop_advance.encapsulation;

import java.util.Random;

class BankAccount{
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    private Random rand = new Random();// used to generate accountNumber

    //used to encapsulate and get accountholdername
    public void getAccountHolderName(){
        System.out.printf("Your account name is: %s.%n", accountHolderName);
    }

    //used to encapsulate and set accountholdername and generate accountNumber;
    public void setAccountHolderName(String name){
        if(name.isEmpty()){
            System.out.println("WARNING: Account Holder Name must not be Empty");
        }else{
            this.accountHolderName = name;
            this.accountNumber = rand.nextInt(100000,999999);
        }
    }

    //used to encapsulate and get AccountNumber
    public void getAccountNumber(){
        System.out.printf("Your account number is: %d.%n", accountNumber);
    }

    //used to encapsulate and get Balance
    public void getBalance(){
        System.out.printf("Your current balance is: %.2f.%n", balance);
    }

    //method to deposit to balance
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.printf("Deposited %.2f successfully.%n", amount);
        }else{
            System.out.println("Deposit amount should be greater than 0.");
        }
    }

    //method to withdraw to balance
    public void withdraw(double amount){
        if(amount < 0){
            System.out.println("Withdrawal amount should be greater than 0.");
        }else if(amount <= balance){
            balance -= amount;
            System.out.printf("Withdrew %.2f successfully.%n", amount);
        }else{
            System.out.println("Withdrawal amount should be greater than current balance.");
        }
    }
}