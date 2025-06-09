package oop_advance.initializer_block;

class Book {
    static String libraryName = "National Public Library";
    static int bookCounter;
    private int bookId;
    private String title;
    private String author;

    //The static block executes this once the class is loaded. only once.
    static {
        System.out.println(libraryName);
    }

    //Instance initializer block to increment the counter and assign bookId.
    //executes every time an object is created, before the constructor.
    {
        bookId = ++bookCounter;
    }

    //constructor to hold book title and author
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    //method to display Book Info
    void displayInfo(){
        System.out.printf("Book Id: %d%n", bookId);
        System.out.printf("Title: %s%n", title);
        System.out.printf("Author: %s%n", author);
    }

    //static method to check the number of books added in the library
    static int totalLibraryBooks(){
        return bookCounter;
    }
} 