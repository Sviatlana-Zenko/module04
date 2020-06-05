package by.java_online.module04.simple_class_and_object.task07.view;

import by.java_online.module04.simple_class_and_object.task07.entity.Triangle;
import by.java_online.module04.simple_class_and_object.task07.logic.TriangleLogic;

public class TriangleView {
    TriangleLogic logic = new TriangleLogic();

    public void printInfoAboutTriangle(Triangle triangle) {
        System.out.println("Triangle ABC: " +
                           "A(" + triangle.getA().getX() + ", " + triangle.getA().getY() + "), " +
                           "B(" + triangle.getB().getX() + ", " + triangle.getB().getY() + "), " +
                           "C(" + triangle.getC().getX() + ", " + triangle.getC().getY() + ")\n" +
                           "Triangle perimeter is " + logic.calculatePerimeter(triangle) + "\n" +
                           "Triangle area is " + logic.calculateArea(triangle) + "\n" +
                           "Median intersection point (" + logic.getIntersectionPoint(triangle).getX() +
                           ", " + logic.getIntersectionPoint(triangle).getY() + ")\n");
    }
}
