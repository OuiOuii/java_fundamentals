package oop_basics.final_keyword;

public class BankAccount {
    final String accountNumber;

    // assignin a value in final variable is only possible in constructors
    BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
    }

    //this is a method with final keyword
    final String getAccountInfo(){
        String result = "Your Account Number is: " + accountNumber;
        return result;
    }

    //int getAccountInfo(){}//method overloading in final is not possible

}
