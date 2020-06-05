package by.java_online.module04.simple_class_and_object.task10.logic;

import by.java_online.module04.simple_class_and_object.task10.entity.Airline;
import by.java_online.module04.simple_class_and_object.task10.entity.FlightSchedule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightScheduleLogic {
    public List<Airline> getFlightsByDestination(FlightSchedule schedule, String destinationToSearch) {
        List<Airline> flightsByDestination = new ArrayList<>();

        for (Airline flight : schedule.getFlights()) {
            if (flight.getDestination().equalsIgnoreCase(destinationToSearch)) {
                flightsByDestination.add(flight);
            }
        }

        return flightsByDestination;
    }
    public List<Airline> getFlightsByDay(FlightSchedule schedule, String dayToSearch) {
        List<Airline> flightsByDay = new ArrayList<>();

        for (Airline flight : schedule.getFlights()) {
            for (String day : flight.getDays()) {
                if (day.equalsIgnoreCase(dayToSearch)) {
                    flightsByDay.add(flight);
                }
            }
        }

        return flightsByDay;
    }

    public List<Airline> getFlightsByDayAndTime(FlightSchedule schedule,
                                                String dayToSearch, Date timeToSearch) {

        List<Airline> flightsByDayAndTime = getFlightsByDay(schedule, dayToSearch);

        for (Airline flight : schedule.getFlights()) {
            if (flight.getTime().before(timeToSearch)) {
                flightsByDayAndTime.remove(flight);
            }
        }

        return flightsByDayAndTime;
    }
}