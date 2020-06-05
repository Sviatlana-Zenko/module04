package by.java_online.module04.aggregation_and_composition.task03.logic;

import by.java_online.module04.aggregation_and_composition.task03.entity.District;
import by.java_online.module04.aggregation_and_composition.task03.entity.Region;
import by.java_online.module04.aggregation_and_composition.task03.entity.State;

public class StateLogic {
    public double calculateStateArea(State state) {
        double area = 0;

        for (Region region : state.getRegions()) {
            for (District district : region.getDistricts()) {
                area += district.getDistrictArea();
            }
        }

        return area;
    }
}
