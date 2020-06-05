/*
 * Создать класс Book, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод  toString().
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Book:
 * id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

package by.java_online.module04.simple_class_and_object.task09.main;

import by.java_online.module04.simple_class_and_object.task09.entity.Book;
import by.java_online.module04.simple_class_and_object.task09.entity.BookBase;
import by.java_online.module04.simple_class_and_object.task09.logic.BookBaseLogic;
import by.java_online.module04.simple_class_and_object.task09.view.BookBaseView;

public class Main {
    public static void main(String[] args) {
        BookBase base = new BookBase();

        base.addBookToBase(new Book(2104, "Little Women", "Louisa Alcott",
                                    "Azbuka", 2018, 384, 8.10, "paperback"));

        base.addBookToBase(new Book(2105, "Good Omens", "Terry Pratchett, Neil Gaiman",
                                    "Eksmo", 2019, 512, 16.03, "hardcover"));

        base.addBookToBase(new Book(2106, "The Institute", "Stephen King",
                                    "AST", 2020, 608, 27.90, "hardcover"));

        base.addBookToBase(new Book(2107, "The Picture of Dorian Gray", "Oscar Wilde",
                                    "AST", 2019, 320, 9.28, "paperback"));

        base.addBookToBase(new Book(2107, "The Green Mile", "Stephen King",
                                    "AST", 2014, 384, 14.96, "hardcover"));

        base.addBookToBase(new Book(2108, "Pride and Prejudice", "Jane Austen",
                                    "Azbuka", 2018, 416, 8.78, "hardcover"));

        BookBaseLogic logic = new BookBaseLogic();
        BookBaseView view = new BookBaseView();

        String authorToSearch = "TERRY PRATCHETT";
        String publishingHouseToSearch = "Eksmo";
        int yearToSearch = 2018;

        System.out.println(authorToSearch + "'s books:");
        view.printListOfBooks(logic.getBooksByAuthor(base, authorToSearch));

        System.out.println("Books of the '" + publishingHouseToSearch + "' publishing house :");
        view.printListOfBooks(logic.getBooksByPublishingHouse(base, publishingHouseToSearch));

        System.out.println("Books published after " + yearToSearch + ":");
        view.printListOfBooks(logic.getBooksByYear(base, yearToSearch));
    }
}