package by.java_online.module04.simple_class_and_object.task05;

public class Counter {
    private int minValue;
    private int maxValue;
    private int currentValue;

    public Counter() {
        minValue = 0;
        maxValue = 15;
        currentValue = 0;
    }

    public Counter(int minValue, int maxValue, int currentValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.currentValue = currentValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "minValue: " + minValue +
                ", maxValue: " + maxValue +
                ", currentValue: " + currentValue +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + currentValue;
        result = prime * result + maxValue;
        result = prime * result + minValue;
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
        Counter other = (Counter) obj;
        if (currentValue != other.currentValue)
            return false;
        if (maxValue != other.maxValue)
            return false;
        if (minValue != other.minValue)
            return false;
        return true;
    }
}