package by.java_online.module04.simple_class_and_object.task01;

public class Logic {
    public int calculateSum(Test1 object){
        int sum;
        sum = object.getX() + object.getY();

        return sum;
    }

    public int findMaxValue(Test1 object) {
        int maxValue;
        maxValue = Math.max(object.getX(), object.getY());

        return maxValue;
    }
}
