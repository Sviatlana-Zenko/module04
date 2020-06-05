package by.java_online.module04.simple_class_and_object.task04.logic;

import by.java_online.module04.simple_class_and_object.task04.entity.Train;

public class ScheduleLogic {
    DepartureTimeLogic logic = new DepartureTimeLogic();

    public void sortByTrainNumber(Train[] trains) {
        boolean isSorted = false;

        while(!isSorted) {
            isSorted = true;

            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].getTrainNumber() > trains[i + 1].getTrainNumber()) {
                    swapElements(trains, i);
                    isSorted = false;
                }
            }
        }
    }

    public void sortByDestinationAndTime(Train[] trains) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < trains.length - 1; i++) {
                if (logic.compareTime(trains[i].getTime(), trains[i + 1].getTime()) == 1) {
                    swapElements(trains, i);
                    isSorted = false;
                }
            }
        }

        isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].getDestination().compareToIgnoreCase(trains[i + 1].getDestination()) > 0) {
                    swapElements(trains, i);
                    isSorted = false;
                }
            }
        }
    }

    public void swapElements(Train[] trains, int i) {
        Train temp = trains[i];

        trains[i] = trains[i + 1];
        trains[i + 1] = temp;
    }
}
