package by.java_online.module04.simple_class_and_object.task04.entity;

import java.util.Arrays;

public class Schedule {
    private Train[] trains;

    public Schedule(Train[] trains) {
        this.trains = trains;
    }

    public Train[] getTrains() {
        return trains;
    }

    public void setTrains(Train[] trains) {
        this.trains = trains;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" + "trains:\n" + Arrays.toString(trains) + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(trains);
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
        Schedule other = (Schedule) obj;
        if (!Arrays.equals(trains, other.trains))
            return false;
        return true;
    }
}