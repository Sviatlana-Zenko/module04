package by.java_online.module04.simple_class_and_object.task03.entity;

import java.util.Arrays;

public class Group {
    private int groupNumber;
    private Student[] students ;

    public Group(int groupNumber, Student[] students) {
        this.groupNumber = groupNumber;
        this.students = students;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "groupNumber: " + groupNumber +
                ", students: " + Arrays.toString(students) +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + groupNumber;
        result = prime * result + Arrays.hashCode(students);
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
        Group other = (Group) obj;
        if (groupNumber != other.groupNumber)
            return false;
        if (!Arrays.equals(students, other.students))
            return false;
        return true;
    }
}