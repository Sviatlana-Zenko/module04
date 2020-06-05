package by.java_online.module04.simple_class_and_object.task03.logic;

import by.java_online.module04.simple_class_and_object.task03.entity.Student;

public class StudentLogic {
    public boolean checkStudentScore(Student student, int bound) {
        boolean isExcellentStudent = true;

        for (int mark : student.getRating()) {
            if (mark < bound) {
                isExcellentStudent = false;
                break;
            }
        }

        return isExcellentStudent;
    }
}
