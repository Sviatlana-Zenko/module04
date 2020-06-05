package by.java_online.module04.simple_class_and_object.task04.entity;

public class Train {
    private int trainNumber;
    private String destination;
    private DepartureTime time;

    public Train() {
    }

    public Train(int trainNumber, String destination, DepartureTime time) {
        this.trainNumber = trainNumber;
        this.destination = destination;
        this.time = time;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public DepartureTime getTime() {
        return time;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setTime(DepartureTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + "{" +
                "trainNumber: " + trainNumber +
                ", destination: " + destination +
                ", time: " + time +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((destination == null) ? 0 : destination.hashCode());
        result = prime * result + ((time == null) ? 0 : time.hashCode());
        result = prime * result + trainNumber;
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
        Train other = (Train) obj;
        if (destination == null) {
            if (other.destination != null)
                return false;
        } else if (!destination.equals(other.destination))
            return false;
        if (time == null) {
            if (other.time != null)
                return false;
        } else if (!time.equals(other.time))
            return false;
        if (trainNumber != other.trainNumber)
            return false;
        return true;
    }
}