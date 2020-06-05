/*
 * Создайте класс Test1 двумя переменными.
 * Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных,
 * и метод, который находит наибольшее значение из этих двух переменных.
 */

package by.java_online.module04.simple_class_and_object.task01;

public class Main {
    public static void main(String[] args) {
        Test1 object1 = new Test1();
        View view = new View();

        view.printInfoAboutObject(object1);

        object1.setX(25);
        object1.setY(28);

        view.printFullInfo(object1);
    }
}
