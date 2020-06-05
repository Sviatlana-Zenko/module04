package by.java_online.module04.simple_class_and_object.task09.logic;

import by.java_online.module04.simple_class_and_object.task09.entity.Book;
import by.java_online.module04.simple_class_and_object.task09.entity.BookBase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookBaseLogic {
    public List<Book> getBooksByAuthor(BookBase base, String authorToSearch) {
        List<Book> booksByAuthor = new ArrayList<>();

        for (Book book : base.getBooks()) {
            if (book.getAuthor().toLowerCase().contains(authorToSearch.toLowerCase())) {
                booksByAuthor.add(book);
            }
        }

        return booksByAuthor;
    }

    public List<Book> getBooksByPublishingHouse(BookBase base, String publishingHouseToSearch) {
        List<Book> booksByPublishingHouse = new ArrayList<>();

        for (Book book : base.getBooks()) {
            if (book.getPublishingHouse().equalsIgnoreCase(publishingHouseToSearch)) {
                booksByPublishingHouse.add(book);
            }
        }

        return booksByPublishingHouse;
    }

    public List<Book> getBooksByYear(BookBase base, int yearToSearch) {
        List<Book> booksByYear = new ArrayList<>();

        for (Book book : base.getBooks()) {
            if (book.getYear() > yearToSearch) {
                booksByYear.add(book);
            }
        }

        booksByYear.sort(Comparator.comparing(Book::getYear));

        return booksByYear;
    }
}