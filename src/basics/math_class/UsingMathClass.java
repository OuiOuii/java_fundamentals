package basics.math_class;
public class UsingMathClass {
    public static void main(String[] args) {
        double num = -4.7;

        System.out.println("Absolute: " + Math.abs(num));
        System.out.println("Square Root: " + Math.sqrt(25));
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Ceil: " + Math.ceil(num));
        System.out.println("Floor: " + Math.floor(num));
        System.out.println("Round: " + Math.round(num));
        System.out.println("Max: " + Math.max(10, 20));
        System.out.println("Min: " + Math.min(10, 20));
        System.out.println("Random [0.0 - 1.0): " + Math.random());
    }
}
