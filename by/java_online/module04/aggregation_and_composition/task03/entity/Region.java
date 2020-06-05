package by.java_online.module04.aggregation_and_composition.task03.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String regionName;
    private City regionalCenter;
    private List<District> districts;

    public Region(String regionName, City regionalCenter) {
        this.regionName = regionName;
        this.regionalCenter = regionalCenter;
        this.districts = new ArrayList<>();
    }

    public Region(String regionName, City regionalCenter, List<District> districts) {
        this.regionName = regionName;
        this.regionalCenter = regionalCenter;
        this.districts = districts;
    }

    public void addDistrictToRegion(District district) {
        districts.add(district);
    }

    public String getRegionName() {
        return regionName;
    }

    public City getRegionalCenter() {
        return regionalCenter;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setRegionalCenter(City regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "regionName: " + regionName +
                ", regionalCenter: " + regionalCenter +
                ", districts: " + districts +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((districts == null) ? 0 : districts.hashCode());
        result = prime * result + ((regionName == null) ? 0 : regionName.hashCode());
        result = prime * result + ((regionalCenter == null) ? 0 : regionalCenter.hashCode());
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
        Region other = (Region) obj;
        if (districts == null) {
            if (other.districts != null)
                return false;
        } else if (!districts.equals(other.districts))
            return false;
        if (regionName == null) {
            if (other.regionName != null)
                return false;
        } else if (!regionName.equals(other.regionName))
            return false;
        if (regionalCenter == null) {
            if (other.regionalCenter != null)
                return false;
        } else if (!regionalCenter.equals(other.regionalCenter))
            return false;
        return true;
    }
}