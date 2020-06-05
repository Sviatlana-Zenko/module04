package by.java_online.module04.aggregation_and_composition.task05.bean;

public class TravelVoucher {
    private TypeOfTravel type;
    private String country;
    private int numberOfDays;
    private double cost;
    private TypeOfTransport transport;
    private TypeOfMeal meal;

    public TravelVoucher(TypeOfTravel type, String country, int numberOfDays,
                         double cost, TypeOfTransport transport, TypeOfMeal meal) {

        this.type = type;
        this.country = country;
        this.numberOfDays = numberOfDays;
        this.cost = cost;
        this.transport = transport;
        this.meal = meal;
    }

    public TypeOfTravel getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public double getCost() {
        return cost;
    }

    public TypeOfTransport getTransport() {
        return transport;
    }

    public TypeOfMeal getMeal() {
        return meal;
    }

    public void setType(TypeOfTravel type) {
        this.type = type;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setTransport(TypeOfTransport transport) {
        this.transport = transport;
    }

    public void setMeal(TypeOfMeal meal) {
        this.meal = meal;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() + " {" +
                "type: " + type +
                ", country: " + country +
                ", numberOfDays: " + numberOfDays +
                ", cost: " + cost +
                ", transport: " + transport +
                ", meal: " + meal +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(cost);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        result = prime * result + ((meal == null) ? 0 : meal.hashCode());
        result = prime * result + numberOfDays;
        result = prime * result + ((transport == null) ? 0 : transport.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
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
        TravelVoucher other = (TravelVoucher) obj;
        if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        if (meal != other.meal)
            return false;
        if (numberOfDays != other.numberOfDays)
            return false;
        if (transport != other.transport)
            return false;
        if (type != other.type)
            return false;
        return true;
    }
}