package by.java_online.module04.simple_class_and_object.task09.view;

import by.java_online.module04.simple_class_and_object.task09.entity.Book;

import java.util.List;

public class BookBaseView {
    InfoOutput output = new InfoOutput();

    public void printListOfBooks(List<Book> books) {
        if (books.size() != 0) {
            for (Book book : books) {
                output.showInfoAboutBook(book);
            }
        } else {
            output.showErrorMessage();
        }

        System.out.println();
    }
}
