package by.java_online.module04.simple_class_and_object.task10.view;

import by.java_online.module04.simple_class_and_object.task10.entity.Airline;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class InfoOutput {
    public void showInfoAboutFlight(Airline flight) {
        System.out.println("- flight number: " + flight.getFlightNumber() +
                           ", destination: " + flight.getDestination()  +
                           ", time: " + new SimpleDateFormat("HH:mm").format(flight.getTime()) +
                           ", days: " + Arrays.toString(flight.getDays()) +
                           ", airplane type: " + flight.getAirplaneType());
    }

    public void showErrorMessage() {
        System.out.println("No flights found. Check your search criteria or try to change them.");
    }
}
