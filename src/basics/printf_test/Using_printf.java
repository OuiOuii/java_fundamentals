package basics.printf_test;

public class Using_printf {
    public static void main(String []args){
        // Using printf
        // Format Structure: %[flags][width][.precision][character-specifier]

        //using %[character-specifier]
        String name = "Jiro";
        int age = 22;
        double money = 533.56;
        char grade = 'A';
        boolean isRich  = false;

        System.out.printf("%nName: %s%n", name); // %s for string and %n for newline

        //multiple values are accepted
        System.out.printf("Age: %d | Money: %f%n", age, money); //%d for int and %f for double or float

        System.out.printf("Grade: %c%n", grade); // %c for char

        System.out.printf("Is rich?: %b%n", isRich); // %b for char
    }
}
