package by.java_online.module04.aggregation_and_composition.task03.entity;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String stateName;
    private City capital;
    private List<Region> regions;

    public State(String stateName, City capital) {
        this.stateName = stateName;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    public State(String stateName, City capital, List<Region> regions) {
        this.stateName = stateName;
        this.capital = capital;
        this.regions = regions;
    }

    public void addRegionToState(Region region) {
        regions.add(region);
    }

    public String getStateName() {
        return stateName;
    }

    public City getCapital() {
        return capital;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "stateName: " + stateName +
                ", capital: " + capital +
                ", regions: " + regions +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((capital == null) ? 0 : capital.hashCode());
        result = prime * result + ((regions == null) ? 0 : regions.hashCode());
        result = prime * result + ((stateName == null) ? 0 : stateName.hashCode());
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
        State other = (State) obj;
        if (capital == null) {
            if (other.capital != null)
                return false;
        } else if (!capital.equals(other.capital))
            return false;
        if (regions == null) {
            if (other.regions != null)
                return false;
        } else if (!regions.equals(other.regions))
            return false;
        if (stateName == null) {
            if (other.stateName != null)
                return false;
        } else if (!stateName.equals(other.stateName))
            return false;
        return true;
    }
}