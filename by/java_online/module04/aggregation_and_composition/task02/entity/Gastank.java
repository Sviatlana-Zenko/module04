package by.java_online.module04.aggregation_and_composition.task02.entity;

public class Gastank {
    private boolean fueled;

    public Gastank() {
    }

    public Gastank(boolean fueled) {
        this.fueled = fueled;
    }

    public boolean getFueled() {
        return fueled;
    }

    public void setFueled(boolean fueled) {
        this.fueled = fueled;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" + "fueled: " + fueled + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (fueled ? 1231 : 1237);
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
        Gastank other = (Gastank) obj;
        if (fueled != other.fueled)
            return false;
        return true;
    }
}