package basics.random_class;
import java.util.Random;

public class RandomNum {
    public static void main(String []args){
        Random rand = new Random();

        int randomInt = rand.nextInt();              // any int value
        int randomIntBounded = rand.nextInt(100);    // int from 0 to 99
        int randomIntRanged = rand.nextInt(5,11); //int from 5 to 10
        double randomDouble = rand.nextDouble();     // double from 0.0 to 1.0
        double randomDoubleRanged = rand.nextDouble(5.00, 9.99);     // double from 5.00 to 9.99
        boolean randomBoolean = rand.nextBoolean();  // true or false
    
        System.out.println("Random Int: " + randomInt);
        System.out.println("Bounded Int (0-99): " + randomIntBounded);
        System.out.println("Ranged Int (5-10): " + randomIntRanged);
        System.out.println("Random Double: " + randomDouble);
        System.out.println("Ranged Double: " + randomDoubleRanged);
        System.out.println("Random Boolean: " + randomBoolean);
    }
}
