package by.java_online.module04.simple_class_and_object.task09.view;

import by.java_online.module04.simple_class_and_object.task09.entity.Book;

public class InfoOutput {
    public void showInfoAboutBook(Book book) {
        System.out.println("- id: " + book.getId() +
                           ", title: " + book.getTitle() +
                           ", author: " + book.getAuthor() +
                           ", publishing house: " + book.getPublishingHouse() +
                           ", year: " + book.getYear() +
                           ", number of pages: " + book.getNumberOfPages() +
                           ", price: " + book.getPrice() +
                           ", cover type: " + book.getCoverType());
    }

    public void showErrorMessage() {
        System.out.println("No books found. Check your search criteria or try to change them.");
    }
}
