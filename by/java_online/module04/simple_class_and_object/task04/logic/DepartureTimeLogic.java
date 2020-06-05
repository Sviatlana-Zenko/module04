package by.java_online.module04.simple_class_and_object.task04.logic;

import by.java_online.module04.simple_class_and_object.task04.entity.DepartureTime;

public class DepartureTimeLogic {
    public int compareTime(DepartureTime time1, DepartureTime time2) {
        int comparisonResult;

        if (time1.getHours() > time2.getHours()) {
            comparisonResult = 1;
        } else if (time1.getHours() < time2.getHours()) {
            comparisonResult = -1;
        } else {
            if (time1.getMinutes() > time2.getMinutes()) {
                comparisonResult = 1;
            } else if (time1.getMinutes() < time2.getMinutes()) {
                comparisonResult = -1;
            } else {
                comparisonResult = 0;
            }
        }

        return comparisonResult;
    }
}
