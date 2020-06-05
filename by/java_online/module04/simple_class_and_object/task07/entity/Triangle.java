package by.java_online.module04.simple_class_and_object.task07.entity;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle() {
        a = new Point(-1, -1);
        b = new Point(0, 1);
        c = new Point(1, -1);
    }

    /*
    Если заданные точки не могут образовать треугольник,
    то создается треугольник с координатами по умолчанию.
     */

    public Triangle(Point a, Point b, Point c) {
        if (checkPoints(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            this.a = new Point(-1, -1);
            this.b = new Point(0, 1);
            this.c = new Point(1, -1);
        }
    }

    public boolean checkPoints(Point a, Point b, Point c) {
        boolean exist = true;
        double expression;

        expression = (b.getX() - a.getX()) * (c.getY() - a.getY()) -
                     (b.getY() - a.getY()) * (c.getX() - a.getX());

        if (expression == 0) {
            exist = false;
        }

        return exist;
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "a: " + a +
                ", b: " + b +
                ", c: " + c +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((a == null) ? 0 : a.hashCode());
        result = prime * result + ((b == null) ? 0 : b.hashCode());
        result = prime * result + ((c == null) ? 0 : c.hashCode());
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
        Triangle other = (Triangle) obj;
        if (a == null) {
            if (other.a != null)
                return false;
        } else if (!a.equals(other.a))
            return false;
        if (b == null) {
            if (other.b != null)
                return false;
        } else if (!b.equals(other.b))
            return false;
        if (c == null) {
            if (other.c != null)
                return false;
        } else if (!c.equals(other.c))
            return false;
        return true;
    }
}