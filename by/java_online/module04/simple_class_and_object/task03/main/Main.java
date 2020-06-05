/*
 * Создайте класс с именем Student, содержащий поля:
 * фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 * Создайте массив из десяти элементов такого типа.
 * Добавьте возможность вывода фамилий и номеров групп студентов,
 * имеющих оценки, равные только 9 или 10.
 */

package by.java_online.module04.simple_class_and_object.task03.main;

import by.java_online.module04.simple_class_and_object.task03.entity.Group;
import by.java_online.module04.simple_class_and_object.task03.entity.Student;
import by.java_online.module04.simple_class_and_object.task03.view.StudentView;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group(101, new Student[] {new Student("Abramov E.P.", new int[] {9, 10, 9, 9, 9}),
                                                     new Student("Bobrik I.A.", new int[] {4, 5, 5, 6, 5}),
                                                     new Student("Petrov A.L.", new int[] {9, 9, 9, 9, 9}),
                                                     new Student("Petrova K.L.", new int[] {9, 10, 9, 10, 9}),
                                                     new Student("Serova T.A.", new int[] {7, 7, 8, 8, 7})});

        Group group2 = new Group(102, new Student[] {new Student("Bazylev K.K.", new int[] {5, 5, 6, 8, 7}),
                                                     new Student("Bobyleva E.A.", new int[] {7, 7, 7, 7, 7}),
                                                     new Student("Ermolkina E.R.", new int[] {8, 5, 5, 7, 5}),
                                                     new Student("Ivanov P.P.", new int[] {7, 8, 8, 9, 9}),
                                                     new Student("Yakushev I.P.", new int[] {6, 6, 8, 7, 6})});

        StudentView view = new StudentView();
        int bound = 9;

        view.printGroupVersion1(group1);
        view.printExcellentStudents(group1, bound);

        view.printGroupVersion2(group2);
        view.printExcellentStudents(group2, bound);
    }
}

