package by.java_online.module04.simple_class_and_object.task10.view;

import by.java_online.module04.simple_class_and_object.task10.entity.Airline;

import java.util.List;

public class FlightScheduleView {
    InfoOutput output = new InfoOutput();

    public void printListOfFlights(List<Airline> flights) {
        if (flights.size() != 0) {
            for (Airline flight : flights) {
                output.showInfoAboutFlight(flight);
            }
        } else {
            output.showErrorMessage();
        }

        System.out.println();
    }
}