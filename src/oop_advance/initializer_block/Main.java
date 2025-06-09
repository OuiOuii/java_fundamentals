package oop_advance.initializer_block;

public class Main {
    public static void main(String[] args) {

        //create an instance to insert new books
        Book b1 = new Book("Jujutsu Kaisen", "Gege Akutami");
        Book b2 = new Book("Berserk", "Kentaro Miura");
        Book b3 = new Book("Oyasumi Punpun", "Inio Asano");

        //display each book info
        b1.displayInfo();
        b2.displayInfo();
        b3.displayInfo();

        //display the total number of books
        System.out.printf("Total Books: %d%n", Book.totalLibraryBooks());
    }
}
