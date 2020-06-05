package by.java_online.module04.aggregation_and_composition.task03.entity;

public class City {
    private String cityName;
    private int population;

    public City() {
    }

    public City(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "cityName: " + cityName +
                ", population=" + population +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
        result = prime * result + population;
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
        City other = (City) obj;
        if (cityName == null) {
            if (other.cityName != null)
                return false;
        } else if (!cityName.equals(other.cityName))
            return false;
        if (population != other.population)
            return false;
        return true;
    }
}
