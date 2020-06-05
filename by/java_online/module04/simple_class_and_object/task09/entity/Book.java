package by.java_online.module04.simple_class_and_object.task09.entity;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int year;
    private int numberOfPages;
    private double price;
    private String coverType;

    public Book() {
    }

    public Book(int id, String title, String author, String publishingHouse,
                int year, int numberOfPages, double price, String coverType) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.coverType = coverType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public String getCoverType() {
        return coverType;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + " {" +
                "id: " + id +
                ", title: " + title +
                ", author: " + author +
                ", publishingHouse: " + publishingHouse +
                ", year: " + year +
                ", numberOfPages: " + numberOfPages +
                ", price: " + price +
                ", coverType: " + coverType +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((coverType == null) ? 0 : coverType.hashCode());
        result = prime * result + id;
        result = prime * result + numberOfPages;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + year;
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
        Book other = (Book) obj;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (coverType == null) {
            if (other.coverType != null)
                return false;
        } else if (!coverType.equals(other.coverType))
            return false;
        if (id != other.id)
            return false;
        if (numberOfPages != other.numberOfPages)
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (publishingHouse == null) {
            if (other.publishingHouse != null)
                return false;
        } else if (!publishingHouse.equals(other.publishingHouse))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        if (year != other.year)
            return false;
        return true;
    }
}