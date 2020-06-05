package by.java_online.module04.aggregation_and_composition.task03.view;

import by.java_online.module04.aggregation_and_composition.task03.entity.Region;
import by.java_online.module04.aggregation_and_composition.task03.entity.State;
import by.java_online.module04.aggregation_and_composition.task03.logic.StateLogic;

public class StateView {
    StateLogic logic = new StateLogic();

    public void printFullInfoAboutState(State state) {
        System.out.printf("%s (capital - '%s').\nArea - %.02f.\n",
                          state.getStateName(), state.getCapital().getCityName(), logic.calculateStateArea(state));

        System.out.println("Number of regions - " + state.getRegions().size() + ":");
        for (Region region : state.getRegions()) {
            System.out.println("- " + region.getRegionName() + ";");
        }
    }
}
