package basics.arrays;

import java.util.Scanner;

public class array_opt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values to be inserted: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        // Input and sum
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value #" + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        // Display array
        System.out.print("Numbers: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
            if (i < n - 1) System.out.print(", ");
        }

        System.out.println("\nSum: " + sum);

        double avg = (double) sum / n;
        System.out.printf("Average: %.2f%n", avg);

        // Display even numbers
        System.out.print("Even Numbers: ");
        boolean first = true;
        for (int num : numbers) {
            if (num % 2 == 0) {
                if (!first) System.out.print(", ");
                System.out.print(num);
                first = false;
            }
        }

        sc.close();
    }
}
