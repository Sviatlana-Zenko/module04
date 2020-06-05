/*
 * Опишите класс, реализующий десятичный счетчик, который может
 * увеличивать или уменьшать свое значение на единицу в заданном
 * диапазоне. Предусмотрите инициализацию счетчика значениями по
 * умолчанию и произвольными значениями. Счетчик имеет методы
 * увеличения и уменьшения состояния, и метод позволяющее получить
 * его текущее состояние. Написать код, демонстрирующий все
 * возможности класса.
 */

package by.java_online.module04.simple_class_and_object.task05;

public class Main {
    public static void main(String[] args) {
        CounterLogic logic = new CounterLogic();
        CounterView view = new CounterView();

        Counter counter1 = new Counter();

        System.out.println("We created an object with default parameters ->");
        view.printInfoAboutCounter(counter1);

        System.out.println("Then we tried to decrease the current value ->");
        logic.subtractValue(counter1);

        System.out.println("After that we increased the current value ->");
        logic.addValue(counter1);
        view.printInfoAboutCounter(counter1);

        System.out.println("We set new minimum, maximum and current values ->");
        counter1.setMinValue(4);
        counter1.setMaxValue(18);
        counter1.setCurrentValue(18);
        view.printInfoAboutCounter(counter1);

        System.out.println("We tried to increase the current value again ->");
        logic.addValue(counter1);

        System.out.println("After that we decreased the current value again ->");
        logic.subtractValue(counter1);
        view.printInfoAboutCounter(counter1);
    }
}