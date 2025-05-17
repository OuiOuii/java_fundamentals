package basics.printf_test;

public class Using_printf_width {
     public static void main(String []args){
        // Using printf
        // Format Structure: %[flags][width][.precision][character-specifier]

        //using %[width]
        String name = "Jericho";

        System.out.printf("%nName:%15s%n", name); // %15s formats 15 character wide field
    }
}
