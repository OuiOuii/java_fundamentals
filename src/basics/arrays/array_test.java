package basics.arrays;
import java.util.Scanner;

public class array_test {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int vals = 0;

        //get the number of values
        System.out.print("Enter the number of values to be inserted: ");
        vals = sc.nextInt();

        //initialize the array size
        int[] num = new int[vals];

        //enter the element for each index
        for(int i = 0; i < vals; i++){
            int valNum = i + 1;
            System.out.print("Enter values #" + valNum + ":");
            num[i] = sc.nextInt();
        }

        //display the array elements
        System.out.print("Numbers: ");
        for (int numbers : num) {
            System.out.printf("%d,", numbers);
        }
        System.out.println(" ");

        //display the sum of numbers
        int sum = 0;  
        for (int numbers : num) {
            sum += numbers;
        }
        System.out.print("Sum: " + sum);
        System.out.println(" ");

        //display the average
        double avg = 0;  
        for (int numbers : num) {
            avg += numbers;
        }
        avg /= num.length;

        System.out.printf("Average: %.2f%n", avg);

        //get the even numbers
        int[] even = new int[num.length];
        for(int i = 0; i < vals; i++){
            if(num[i] % 2 == 0) even[i] = num[i];
        }

        //display the even numbers
        System.out.print("Even Nums: ");
        for (int evens : even) {
            System.out.printf("%d,", evens);
        }

        sc.close();
    }
}
