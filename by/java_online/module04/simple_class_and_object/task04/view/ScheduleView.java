package by.java_online.module04.simple_class_and_object.task04.view;

import by.java_online.module04.simple_class_and_object.task04.entity.Schedule;
import by.java_online.module04.simple_class_and_object.task04.entity.Train;
import by.java_online.module04.simple_class_and_object.task04.input.UserInput;

public class ScheduleView {
    InfoOutput output = new InfoOutput();
    UserInput input = new UserInput();

    public void printTrainSchedule(Schedule schedule) {
        for (Train train : schedule.getTrains()) {
            output.showInfoAboutTrain(train);
        }

        System.out.println();
    }

    public void printInfoAboutChosenTrain(Schedule schedule) {
        boolean exist = false;
        int numberToSearch;

        numberToSearch = input.enterTrainNumber("Enter train number to see detailed information:");

        for (Train train : schedule.getTrains()) {
            if (train.getTrainNumber() == numberToSearch) {
                output.showInfoAboutTrain(train);
                exist = true;
            }
        }

        if (!exist) {
            output.showErrorMessage(numberToSearch);
        }

        System.out.println();
    }
}