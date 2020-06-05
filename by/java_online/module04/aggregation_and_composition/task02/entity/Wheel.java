package by.java_online.module04.aggregation_and_composition.task02.entity;

public class Wheel {
    private boolean flat;   // Указывает на состояние шины (спушена или нет)

    public Wheel() {
    }

    public Wheel(boolean flat) {
        this.flat = flat;
    }

    public boolean getFlat() {
        return flat;
    }

    public void setFlat(boolean flat) {
        this.flat = flat;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" + "flat: " + flat + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (flat ? 1231 : 1237);
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
        Wheel other = (Wheel) obj;
        if (flat != other.flat)
            return false;
        return true;
    }
}