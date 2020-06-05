package by.java_online.module04.aggregation_and_composition.task05.bean;

public class ClientRequest {
    private TypeOfTransport transport;
    private TypeOfMeal meal;
    private int maxNumberOfDays;

    public ClientRequest() {
    }

    public ClientRequest(TypeOfTransport transport, TypeOfMeal meal, int maxNumberOfDays) {
        this.transport = transport;
        this.meal = meal;
        this.maxNumberOfDays = maxNumberOfDays;
    }

    public TypeOfTransport getTransport() {
        return transport;
    }

    public TypeOfMeal getMeal() {
        return meal;
    }

    public int getMaxNumberOfDays() {
        return maxNumberOfDays;
    }

    public void setTransport(TypeOfTransport transport) {
        this.transport = transport;
    }

    public void setMeal(TypeOfMeal meal) {
        this.meal = meal;
    }

    public void setMaxNumberOfDays(int maxNumberOfDays) {
        this.maxNumberOfDays = maxNumberOfDays;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "transport: " + transport +
                ", meal: " + meal +
                ", maxNumberOfDays: " + maxNumberOfDays +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + maxNumberOfDays;
        result = prime * result + ((meal == null) ? 0 : meal.hashCode());
        result = prime * result + ((transport == null) ? 0 : transport.hashCode());
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
        ClientRequest other = (ClientRequest) obj;
        if (maxNumberOfDays != other.maxNumberOfDays)
            return false;
        if (meal != other.meal)
            return false;
        if (transport != other.transport)
            return false;
        return true;
    }
}