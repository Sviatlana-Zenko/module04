package by.java_online.module04.simple_class_and_object.task05;

public class CounterLogic {
    public void addValue(Counter counter) {
        if (counter.getCurrentValue() < counter.getMaxValue()) {
            int newCurrentValue;
            newCurrentValue = counter.getCurrentValue() + 1;

            counter.setCurrentValue(newCurrentValue);
        } else {
            System.out.println("The current value can't be increased (the maximum value reached).\n");
        }
    }

    public void subtractValue(Counter counter) {
        if (counter.getCurrentValue() - 1 >= counter.getMinValue()) {
            int newCurrentValue;
            newCurrentValue = counter.getCurrentValue() - 1;

            counter.setCurrentValue(newCurrentValue);
        } else {
            System.out.println("The current value can't be decreased (the minimum value reached).\n");
        }
    }
}

