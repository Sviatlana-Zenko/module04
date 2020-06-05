package by.java_online.module04.simple_class_and_object.task04.view;

import by.java_online.module04.simple_class_and_object.task04.entity.Train;

public class InfoOutput {
    public void showInfoAboutTrain(Train train) {
        System.out.printf("Train number: %d, destination: %s, departure time - %02d:%02d",
                          train.getTrainNumber(), train.getDestination(),
                          train.getTime().getHours(), train.getTime().getMinutes());

        System.out.println();
    }

    public void showErrorMessage(int numberToSearch) {
        System.out.println("There is no train with number " + numberToSearch + ".");
    }
}