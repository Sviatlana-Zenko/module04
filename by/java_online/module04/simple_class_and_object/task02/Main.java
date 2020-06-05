/*
 * Создйте класс Test2 двумя переменными.
 * Добавьте конструктор с входными параметрами.
 * Добавьте конструктор, инициализирующий члены класса по умолчанию.
 * Добавьте set- и get- методы для полей экземпляра класса.
 */

package by.java_online.module04.simple_class_and_object.task02;

public class Main {
    public static void main(String[] args) {
        Test2 object = new Test2(16, 18);
        View view = new View();

        view.printInfoAboutObject(object);

        object.setX(15);
        object.setY(11);

        view.printInfoAboutObject(object);
    }

}
