package basics.printf_test;

public class Using_printf_flag {
    public static void main(String []args){
        // Using printf
        // Format Structure: %[flags][width][.precision][character-specifier]

        //using %[flags]
        int age = 22;

        System.out.printf("%nAge: [%-5d]%n", age); // %-5d outputs left padding with 5 maximum char width
        System.out.printf("%nAge: [%05d]%n", age); // %05d outputs 0 padding with 5 maximum char width
        System.out.printf("%nAge: [%5d]%n", age); // %5d outputs with 5 maximum char width
        System.out.printf("%nAge: [%+d]%n", age); // %+d outputs with + symbol
        System.out.printf("%nAge: [% d]%n", age); // %+d outputs with space before
    }
}
