/*
 * Описать класс, представляющий треугольник. Предусмотреть
 * методы для создания объектов, вычисления площади, периметра
 * и точки пересечения медиан.
 */

package by.java_online.module04.simple_class_and_object.task07.main;

import by.java_online.module04.simple_class_and_object.task07.entity.Point;
import by.java_online.module04.simple_class_and_object.task07.entity.Triangle;
import by.java_online.module04.simple_class_and_object.task07.view.TriangleView;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(new Point(-5, -2), new Point(-2, 3), new Point(3, 1));

        // Создастся треугольник с координатами вершин по умолчанию
        Triangle triangle2 = new Triangle(new Point(-3, -1), new Point(0, 0), new Point(3, 1));

        TriangleView view = new TriangleView();

        view.printInfoAboutTriangle(triangle1);
        view.printInfoAboutTriangle(triangle2);
    }
}
