package BasicExercises.Object_Oriented_Programming;

import java.util.ArrayList;

public class Object_Oriented_Programming5 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса «Книга» с атрибутами для названия, автора и ISBN, а также
        методами для добавления и удаления книг из коллекции.
         */

//        Book book1 = new Book("Java. Руководство для начинающих", "Герберт Шилдт", "123456789");
//        Book book2 = new Book("Java. Библиотека профессионала", "Кей С. Хорстманн", "987654321");
//        Book.addBook(book1);
//        Book.addBook(book2);
//        ArrayList<Book> listBook = Book.getListBook();
//
//        System.out.println("List of books: ");
//        for (Book book : listBook) {
//            System.out.println(book.getTitle() + ", " + book.getAuthor() + ", ISBN: " + book.getISBN());
//        }
//
//        Book.removeBook(book2);
//
//        System.out.println("\nList of books after deletion: " + book2.getTitle() + "\n");
//        for (Book book : listBook) {
//            System.out.println(book.getTitle() + ", " + book.getAuthor() + ", ISBN: " + book.getISBN());
//        }
    }
}

//class Book {
//
//    String title;
//    String author;
//    String ISBN;
//
//    static ArrayList<Book> listBook = new ArrayList<>();
//
//    public Book(String title, String author, String ISBN) {
//        this.title = title;
//        this.author = author;
//        this.ISBN = ISBN;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public String getISBN() {
//        return ISBN;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public void setISBN(String ISBN) {
//        this.ISBN = ISBN;
//    }
//
//    public static void addBook(Book book) {
//
//        listBook.add(book);
//    }
//
//    public static void removeBook(Book book) {
//
//        listBook.remove(book);
//    }
//
//    public static ArrayList <Book> getListBook() {
//        return listBook;
//    }
//}
