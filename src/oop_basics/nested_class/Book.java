package oop_basics.nested_class;

public class Book {
    String title;

    //constructor of Book
    Book(String title){
        this.title = title;
    }

    //This is inner-class (non-statc)
    class Author{
        String name;

        //constructor of Author
        Author(String name){
            this.name = name;
        }
    }

    //"Author" is treated like a valid class type — just like String, int, or any other class.
    //Therefore it can be used in a method parameter (It needs to have a constructor).
    void showBookInfo(Author author){
        System.out.printf("Book Title: %s%n", title);// displays the title value from constructor
        System.out.printf("Author: %s%n", author.name);// displays the name value from constructor
    }
}
