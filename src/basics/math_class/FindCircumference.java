package basics.math_class;

import java.util.Scanner;

public class FindCircumference {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        double circum, radius;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();

        circum = 2 * Math.PI * radius;

        System.out.println("The circumference is " + circum + " cm");
        sc.close();
    }
}
