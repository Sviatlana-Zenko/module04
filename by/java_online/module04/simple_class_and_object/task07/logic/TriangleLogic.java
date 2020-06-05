package by.java_online.module04.simple_class_and_object.task07.logic;

import by.java_online.module04.simple_class_and_object.task07.entity.Point;
import by.java_online.module04.simple_class_and_object.task07.entity.Triangle;

public class TriangleLogic {
    public double calculateArea(Triangle triangle) {
        double[] arrayOfSides;
        double expression;
        double halfPerimeter;
        double triangleArea;

        expression = 1;

        arrayOfSides = formArrayOfSides(triangle);
        halfPerimeter = (calculatePerimeter(triangle)) / 2;

        for (int i = 0; i < arrayOfSides.length; i++) {
            expression *= halfPerimeter - arrayOfSides[i];
        }

        triangleArea = Math.sqrt(halfPerimeter * expression);

        return triangleArea;
    }

    public double calculatePerimeter(Triangle triangle) {
        double perimeter;
        double[] arrayOfSides;

        perimeter = 0;
        arrayOfSides = formArrayOfSides(triangle);

        for (int i = 0; i < arrayOfSides.length; i++) {
            perimeter += arrayOfSides[i];
        }

        return perimeter;
    }

    public Point getIntersectionPoint(Triangle triangle) {
        double newX;
        double newY;

        newX = (triangle.getA().getX() + triangle.getB().getX() + triangle.getC().getX()) / 3;
        newY = (triangle.getA().getY() + triangle.getB().getY() + triangle.getC().getY()) / 3;

        return new Point(newX, newY);
    }

    public double[] formArrayOfSides(Triangle triangle) {
        int numberOfSides = 3;
        double[] array = new double[numberOfSides];

        array[0] = calculateSide(triangle.getA(), triangle.getB());
        array[1] = calculateSide(triangle.getA(), triangle.getC());
        array[2] = calculateSide(triangle.getB(), triangle.getC());

        return array;
    }

    public double calculateSide(Point p1, Point p2) {
        double sideLength;

        sideLength = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) +
                               Math.pow((p2.getY() - p1.getY()), 2));

        return sideLength;
    }
}
