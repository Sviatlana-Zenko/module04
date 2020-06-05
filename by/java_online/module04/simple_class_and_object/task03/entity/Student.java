package by.java_online.module04.simple_class_and_object.task03.entity;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] rating;

    public Student(String name, int[] rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int[] getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int[] rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + "{" +
                "name: " + name +
                ", rating: " + Arrays.toString(rating) +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Arrays.hashCode(rating);
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
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (!Arrays.equals(rating, other.rating))
            return false;
        return true;
    }
}