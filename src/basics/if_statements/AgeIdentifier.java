package basics.if_statements;
import java.util.Scanner;

public class AgeIdentifier {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        //Age Identifier using If Else Statement

        int age;

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if(age <= 0) System.out.println("You are not born yet");
        else if(age <= 12) System.out.println("You are a child");
        else if(age <= 19) System.out.println("You are a teen");
        else if(age <= 64) System.out.println("You are an adult");
        else if(age <= 100) System.out.println("You are a senior citizen");
        else if(age <= 119) System.out.println("You are an ultra senior citizen");
        else if(age >= 120) System.out.println("You are dead");

        sc.close();
    }
}
