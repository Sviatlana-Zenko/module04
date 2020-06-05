package by.java_online.module04.simple_class_and_object.task03.view;

import by.java_online.module04.simple_class_and_object.task03.entity.Group;
import by.java_online.module04.simple_class_and_object.task03.entity.Student;
import by.java_online.module04.simple_class_and_object.task03.logic.StudentLogic;

public class StudentView {
    InfoOutput output = new InfoOutput();
    StudentLogic logic = new StudentLogic();

    public void printGroupVersion1(Group group) {
        System.out.println("Group " + group.getGroupNumber() + ":");

        for (Student student : group.getStudents()) {
            output.showInfoAboutStudent(student);
        }

        System.out.println();
    }

    public void printGroupVersion2(Group group) {
        System.out.println(group + "\n");
    }

    public void printExcellentStudents(Group group, int bound) {
        int studentCounter = 0;

        System.out.println("List of excellent students (group " + group.getGroupNumber() + "):");

        for (Student student : group.getStudents()) {
            if (logic.checkStudentScore(student, bound)) {
                output.showInfoAboutStudent(student);
                studentCounter++;
            }
        }

        if (studentCounter == 0) {
            output.showErrorMessage(bound);
        }

        System.out.println();
    }
}