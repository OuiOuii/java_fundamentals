package oop_advance.pass_by_value_and_reference;

class Dog {
    String name;
}

public class Challenge {
    public static void renameDog(Dog d) {
        d.name = "Bolt";
    }

    public static void newDog(Dog d) {
        d = new Dog();
        d.name = "Max";
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Fido";

        newDog(dog);
        System.out.println(dog.name); // Prints Fido

        renameDog(dog);
        System.out.println(dog.name); // Prints Bolt


    }
}
