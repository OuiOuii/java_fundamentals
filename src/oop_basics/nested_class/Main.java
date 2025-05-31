package oop_basics.nested_class;

public class Main {
    public static void main(String []args){
        Book book = new Book("Jujutsu Kaisen");
        Book.Author author = book.new Author("Gege Akutami");

        book.showBookInfo(author);
    }
}
