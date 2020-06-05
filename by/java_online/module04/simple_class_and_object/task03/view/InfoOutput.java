package by.java_online.module04.simple_class_and_object.task03.view;

import by.java_online.module04.simple_class_and_object.task03.entity.Student;

public class InfoOutput {
    public void showInfoAboutStudent(Student student) {
        System.out.print(student.getName() + ", rating [");

        for (int i = 0; i < student.getRating().length; i++) {
            if (i == student.getRating().length - 1) {
                System.out.print(student.getRating()[i]);
            } else {
                System.out.print(student.getRating()[i] + ", ");
            }
        }

        System.out.println("];");
    }

    public void showErrorMessage(int bound) {
        System.out.println("There are no students with a rating of " +
                            bound +  " and higher.");
    }
}