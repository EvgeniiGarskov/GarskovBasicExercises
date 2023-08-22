package BasicExercises.Object_Oriented_Programming;

import java.util.ArrayList;

public class Object_Oriented_Programming11 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса «Библиотека» с набором книг и методов для добавления и
        удаления книг.
         */

//        Library library = new Library();
//
//        Book book1 = new Book("JAVA. Effective programming", "Joshua Bloch");
//        Book book2 = new Book("JAVA EE паттерны проектирования для профессионалов", "Murat Yener");
//
//        library.addBook(book1);
//        library.addBook(book2);
//
//        ArrayList<Book> books = library.getBooks();
//
//        System.out.println("Books in the library:");
//        for (Book book : library.getBooks()) {
//            System.out.println(book.getName() + ", author: " + book.getAuthor());
//        }
//
//        library.removeBook(book1);
//
//        System.out.println("\nBooks in the library after deletion 'JAVA. Effective programming':");
//        for (Book book : library.getBooks()) {
//            System.out.println(book.getName() + ", author: " + book.getAuthor());
//        }
    }
}

//class Book {
//    String name;
//    String author;
//
//    public Book(String name, String author) {
//        this.name = name;
//        this.author = author;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//}
//
//class Library {
//
//    ArrayList <Book> books;
//
//    public Library() {
//        books = new ArrayList <Book>();
//    }
//
//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    public void removeBook(Book book) {
//        books.remove(book);
//    }
//
//    public ArrayList <Book> getBooks() {
//        return books;
//    }
//}