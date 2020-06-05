package by.java_online.module04.simple_class_and_object.task01;

public class View {
    Logic logic = new Logic();

    public void printInfoAboutObject(Test1 object) {
        System.out.println("Test1 [x = " + object.getX() + ", y = " + object.getY() + "];\n");
    }

    public void printFullInfo(Test1 object) {
        int sum;
        int maxValue;

        sum = logic.calculateSum(object);
        maxValue = logic.findMaxValue(object);

        System.out.println("Test1 [x = " + object.getX() + ", y = " + object.getY() + "];" +
                           "\nSum = " + sum +
                           "\nMaximum value = " + maxValue + "\n");
    }
}
