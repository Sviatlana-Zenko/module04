/*
 * Составьте описание класса для представления времени. Предусмотрте
 * возможности установки времени и изменения его отдельных полей (час,
 * минута, секунда) с проверкой допустимости вводимых значений.
 * В случае недопустимых значений полей поле устанавливается в значение 0.
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

package by.java_online.module04.simple_class_and_object.task06;

public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        TimeLogic logic = new TimeLogic();
        TimeView view = new TimeView();

        System.out.print("The current time - ");
        view.printTime(time);

        System.out.print("Setting new values for object fields, new current time - ");
        time.setHours(14);
        time.setMinutes(55);
        time.setSeconds(99);
        view.printTime(time);

        System.out.print("Changing time (adding), new current time - ");
        logic.addTime(time, 28, 121, 78);
        view.printTime(time);

        System.out.print("Changing time (subtraction), new current time - ");
        logic.subtractTime(time, 14, 5, 14);
        view.printTime(time);
    }
}