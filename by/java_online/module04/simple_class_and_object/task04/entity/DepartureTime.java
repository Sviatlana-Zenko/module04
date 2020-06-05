package by.java_online.module04.simple_class_and_object.task04.entity;

public class DepartureTime {
    private int hours;
    private int minutes;

    public DepartureTime() {
        hours = 0;
        minutes = 0;
    }

    public DepartureTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) {
            this.hours = hours;
        } else {
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            this.minutes = 0;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "hours: " + hours +
                ", minutes: " + minutes +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + hours;
        result = prime * result + minutes;
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
        DepartureTime other = (DepartureTime) obj;
        if (hours != other.hours)
            return false;
        if (minutes != other.minutes)
            return false;
        return true;
    }
}