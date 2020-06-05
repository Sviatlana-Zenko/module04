package by.java_online.module04.simple_class_and_object.task10.entity;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Airline {
    private String flightNumber;
    private String destination;
    private Date time;
    private String[] days;
    private String airplaneType;

    public Airline(String flightNumber, String destination,
                   Date time, String[] days, String airplaneType) {

        this.flightNumber = flightNumber;
        this.destination = destination;
        this.time = time;
        this.days = days;
        this.airplaneType = airplaneType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public Date getTime() {
        return time;
    }

    public String[] getDays() {
        return days;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setDays(String[] days) {
        this.days = days;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + " {" +
                "flightNumber: " + flightNumber +
                ", destination: " + destination +
                ", time: " + new SimpleDateFormat("HH:mm").format(time) +
                ", days: " + Arrays.toString(days) +
                ", airplaneType: " + airplaneType +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
        result = prime * result + Arrays.hashCode(days);
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
        result = prime * result + ((time == null) ? 0 : time.hashCode());
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
        Airline other = (Airline) obj;
        if (airplaneType == null) {
            if (other.airplaneType != null)
                return false;
        } else if (!airplaneType.equals(other.airplaneType))
            return false;
        if (!Arrays.equals(days, other.days))
            return false;
        if (destination == null) {
            if (other.destination != null)
                return false;
        } else if (!destination.equals(other.destination))
            return false;
        if (flightNumber == null) {
            if (other.flightNumber != null)
                return false;
        } else if (!flightNumber.equals(other.flightNumber))
            return false;
        if (time == null) {
            if (other.time != null)
                return false;
        } else if (!time.equals(other.time))
            return false;
        return true;
    }
}