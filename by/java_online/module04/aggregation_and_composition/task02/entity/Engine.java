package by.java_online.module04.aggregation_and_composition.task02.entity;

public class Engine {
    private double capacity;

    public Engine() {
    }

    public Engine(double capacity) {
        this.capacity = capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" + "capacity: " + capacity + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(capacity);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        Engine other = (Engine) obj;
        if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
            return false;
        return true;
    }
}
