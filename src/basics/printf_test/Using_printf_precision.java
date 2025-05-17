package basics.printf_test;

public class Using_printf_precision {
        public static void main(String []args){
        // Using printf
        // Format Structure: %[flags][width][.precision][character-specifier]

        //using %[.precision]
        String name = "Jericho";
        double money = 533.567345;
        double money2 = 533.567345;

        System.out.printf("%nName: %.3s%n", name); // %.3s only outputs first 3 characters of a String

        System.out.printf("Money (no format): %f%n", money); // this has no precision format

        System.out.printf("Money (with format): %.2f%n", money2); // %.2f limits output to 2 decimal
    }
}