package by.java_online.module04.simple_class_and_object.task05;

public class CounterView {
    public void printInfoAboutCounter(Counter counter) {
        System.out.println("The current value is " + counter.getCurrentValue() + ".\n" +
                           "(min. value - " + counter.getMinValue() + "; " +
                           "max. value - " + counter.getMaxValue() + ")\n");
    }
}
