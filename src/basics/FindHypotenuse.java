package basics;

import java.util.Scanner;
public class FindHypotenuse {
    public static void main(String []args){
            //Hypotenuse finder 
            //Formula: HYPOTENUSE c= Math. sqrt(a2 + b2)
            Scanner sc = new Scanner(System.in);

            double a, b, c;

            System.out.print("Enter side a length: ");
            a = sc.nextDouble();

            System.out.print("Enter side b length: ");
            b = sc.nextDouble();

            c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

            System.out.println("The hypotenuse is " + c + " cm");

            sc.close();
    


    }
}
