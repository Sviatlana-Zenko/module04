package by.java_online.module04.simple_class_and_object.task06;

public class TimeView {
    public void printTime(Time time) {
        System.out.printf("%02d:%02d:%02d", time.getHours(), time.getMinutes(), time.getSeconds());
        System.out.println();
    }
}

