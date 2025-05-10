package basics;
import java.util.Scanner;

public class StoreItems {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        //Store Item Details
        String item;
        double price, total;
        int quantity;
        char currency = '$';

        System.out.print("Enter item name: ");
        item  = sc.nextLine();

        System.out.print("Enter item price: ");
        price = sc.nextDouble();

        System.out.print("Enter item quantity: ");
        quantity = sc.nextInt();

        total = price * quantity;
        
        System.out.print("The item is " + item + ", and total price is " + currency + total);
        sc.close();
    }
}
