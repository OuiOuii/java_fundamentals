package basics;

import java.util.Scanner;

public class FindArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double area, radius;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();

        area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area is " + area + " cm²");
        sc.close();
    }
}
