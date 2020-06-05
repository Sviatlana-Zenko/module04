/*
 * Создайте класс Train, содержащий поля:
 * название пункта назначения, номер поезда, время отправления.
 * - создайте данные в массив из пяти элементов типа Train,
 * - добавьте возможность сортировки элементов массива по номерам поездов,
 * - добавьте возможность вывода информации о поезде,
 * номер которого введен пользователем,
 * - добавьте возможность сортировки массив по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны
 * быть упорядочены по времени отправления.
 */

package by.java_online.module04.simple_class_and_object.task04.main;

import by.java_online.module04.simple_class_and_object.task04.entity.DepartureTime;
import by.java_online.module04.simple_class_and_object.task04.entity.Schedule;
import by.java_online.module04.simple_class_and_object.task04.entity.Train;
import by.java_online.module04.simple_class_and_object.task04.logic.ScheduleLogic;
import by.java_online.module04.simple_class_and_object.task04.view.ScheduleView;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule(new Train[] {new Train(2514, "Brest", new DepartureTime(22, 30)),
                                                       new Train(1418, "Minsk", new DepartureTime(11, 10)),
                                                       new Train(7484, "Minsk", new DepartureTime(7, 30)),
                                                       new Train(7484, "Brest", new DepartureTime(18, 20)),
                                                       new Train(1001, "Grodno", new DepartureTime(15, 5))});

        ScheduleLogic scheduleLogic = new ScheduleLogic();
        ScheduleView scheduleView = new ScheduleView();

        System.out.println("Trains sorted by number:");
        scheduleLogic.sortByTrainNumber(schedule.getTrains());
        scheduleView.printTrainSchedule(schedule);

        scheduleView.printInfoAboutChosenTrain(schedule);

        System.out.println("Trains sorted by destination and time:");
        scheduleLogic.sortByDestinationAndTime(schedule.getTrains());
        scheduleView.printTrainSchedule(schedule);
    }
}