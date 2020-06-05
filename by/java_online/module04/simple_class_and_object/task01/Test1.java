package by.java_online.module04.simple_class_and_object.task01;

public class Test1 {
    private int x;
    private int y;

    public Test1() {
        x = 0;
        y = 0;
    }
    public Test1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
