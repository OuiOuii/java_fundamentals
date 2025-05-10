package basics;

import java.util.Scanner;

public class FindVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double volume, radius;

        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();

        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume is " + volume + " cm");
        sc.close();
    }
}
