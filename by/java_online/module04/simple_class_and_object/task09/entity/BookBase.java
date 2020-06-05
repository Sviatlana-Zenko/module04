package by.java_online.module04.simple_class_and_object.task09.entity;

import java.util.ArrayList;
import java.util.List;

public class BookBase {
    private List<Book> books;

    public BookBase() {
        books = new ArrayList<>();
    }

    public BookBase(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBookToBase(Book book){
        books.add(book);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" + "books: " + books + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((books == null) ? 0 : books.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BookBase other = (BookBase) obj;
        if (books == null) {
            if (other.books != null)
                return false;
        } else if (!books.equals(other.books))
            return false;
        return true;
    }
}