package by.java_online.module04.simple_class_and_object.task10.entity;

import java.util.ArrayList;
import java.util.List;

public class FlightSchedule {
    private List<Airline> flights;

    public FlightSchedule() {
        flights = new ArrayList<>();
    }

    public FlightSchedule(List<Airline> flights) {
        this.flights = flights;
    }

    public List<Airline> getFlights() {
        return flights;
    }

    public void setFlights(List<Airline> flights) {
        this.flights = flights;
    }

    public void addFlightToSchedule(Airline flight){
        flights.add(flight);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" + "flights:\n" + flights + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((flights == null) ? 0 : flights.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FlightSchedule other = (FlightSchedule) obj;
        if (flights == null) {
            if (other.flights != null)
                return false;
        } else if (!flights.equals(other.flights))
            return false;
        return true;
    }
}