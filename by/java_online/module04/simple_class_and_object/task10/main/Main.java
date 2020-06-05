/*
 * Создать класс Airline, спецификация которого приведена ниже.
 * Определить конструкторы, set- и get- методы и метод  toString().
 * Создать второй класс, агрегирующий массив типа Airline,
 * с подходящими конструкторами и методами. Задать критерии выбора
 * данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

package by.java_online.module04.simple_class_and_object.task10.main;

import by.java_online.module04.simple_class_and_object.task10.entity.Airline;
import by.java_online.module04.simple_class_and_object.task10.entity.FlightSchedule;
import by.java_online.module04.simple_class_and_object.task10.logic.FlightScheduleLogic;
import by.java_online.module04.simple_class_and_object.task10.view.FlightScheduleView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        FlightSchedule schedule = new FlightSchedule();

        schedule.addFlightToSchedule(new Airline("SU 6665", "Moscow", parseTime("19:00"),
                                                 new String[]{"Tuesday"}, "Airbus A310"));

        schedule.addFlightToSchedule(new Airline("OS 690", "Riga", parseTime("05:30"),
                                                 new String[]{"Friday"}, "Boeing-737"));

        schedule.addFlightToSchedule(new Airline("SU 7124", "Kiev", parseTime("12:25"),
                                                 new String[]{"Saturday", "Sunday"}, "Airbus A330"));

        schedule.addFlightToSchedule(new Airline("SU 7050","Kiev", parseTime("04:15"),
                                                 new String[]{"Wednesday"}, "Airbus A310"));

        schedule.addFlightToSchedule(new Airline("SU 7050", "Minsk", parseTime("10:00"),
                                                 new String[]{"Tuesday", "Friday"}, "Airbus A310"));

        schedule.addFlightToSchedule(new Airline("OS 730", "London", parseTime("10:30"),
                                                 new String[]{"Friday"}, "Boeing-737"));

        schedule.addFlightToSchedule(new Airline("SU 4556", "Moscow", parseTime("21:00"),
                                                 new String[]{"Wednesday"}, "Airbus A330"));

        FlightScheduleLogic logic = new FlightScheduleLogic();
        FlightScheduleView view = new FlightScheduleView();

        String destinationToSearch = "KIEV";
        String dayToSearch = "tuesday";
        Date timeToSearch = parseTime("14:30");

        System.out.println("Flights to " + destinationToSearch + ":");
        view.printListOfFlights(logic.getFlightsByDestination(schedule, destinationToSearch));

        System.out.println("Flights scheduled on " + dayToSearch + ":");
        view.printListOfFlights(logic.getFlightsByDay(schedule, dayToSearch));

        System.out.println("Flights scheduled on " + dayToSearch + " after " +
                           new SimpleDateFormat("HH:mm").format(timeToSearch) + ":");

        view.printListOfFlights(logic.getFlightsByDayAndTime(schedule, dayToSearch, timeToSearch));
    }

    public static Date parseTime(String time) throws ParseException {
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");

        return timeFormat.parse(time);
    }
}