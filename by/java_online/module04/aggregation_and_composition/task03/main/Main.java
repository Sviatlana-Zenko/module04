/*
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры.
 */

package by.java_online.module04.aggregation_and_composition.task03.main;

import by.java_online.module04.aggregation_and_composition.task03.entity.City;
import by.java_online.module04.aggregation_and_composition.task03.entity.District;
import by.java_online.module04.aggregation_and_composition.task03.entity.Region;
import by.java_online.module04.aggregation_and_composition.task03.entity.State;
import by.java_online.module04.aggregation_and_composition.task03.view.StateView;

public class Main {
    public static void main(String[] args) {
        Region r1 = new Region("First region", new City("City-1", 1245));
        r1.addDistrictToRegion(new District("One", 25.14));
        r1.addDistrictToRegion(new District("Two", 14.36));
        r1.addDistrictToRegion(new District("Three", 78.25));

        Region r2 = new Region("Second region", new City("City-2", 652));
        r2.addDistrictToRegion(new District("One", 45.71));
        r2.addDistrictToRegion(new District("Two", 25.25));
        r2.addDistrictToRegion(new District("Three", 36.9));

        Region r3 = new Region("Third region", new City("City-3", 1020));
        r3.addDistrictToRegion(new District("One", 85.01));
        r3.addDistrictToRegion(new District("Two", 35.22));

        State state = new State("State", new City("Capital", 3541));
        state.addRegionToState(r1);
        state.addRegionToState(r2);
        state.addRegionToState(r3);

        StateView view = new StateView();
        view.printFullInfoAboutState(state);
    }
}
