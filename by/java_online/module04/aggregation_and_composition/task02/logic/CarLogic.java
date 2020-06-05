package by.java_online.module04.aggregation_and_composition.task02.logic;

import by.java_online.module04.aggregation_and_composition.task02.entity.Car;
import by.java_online.module04.aggregation_and_composition.task02.entity.Gastank;
import by.java_online.module04.aggregation_and_composition.task02.entity.Wheel;

import java.util.List;

public class CarLogic {
    public void ride(Car car) {
        if (checkWheels(car.getWheels()) == true &
                checkGastank(car.getGastank()) == true) {

            System.out.println("Your car is ready. Let's ride.\n");
        } else {
            System.out.println("Fix defect(s).\n");
        }
    }

    public boolean checkWheels(List<Wheel> wheels) {
        boolean isReady = true;

        if (wheels.size() < 4) {
            isReady = false;
            System.out.println("Only " + wheels.size() + " wheel(s) installed.");

        }

        for (Wheel wheel : wheels) {
            if (wheel.getFlat() == false) {
                System.out.println("Some tires flat. Replace them.");
                isReady = false;
            }
        }

        return isReady;
    }

    public boolean checkGastank(Gastank gastank) {
        boolean isReady = true;

        if (gastank.getFueled() == false) {
            System.out.println("Refuel your car.");
            isReady = false;
        }

        return isReady;
    }

    public void replaceWheel(Car car) {
        for (int i = 0; i < car.getWheels().size(); i++) {
            if (car.getWheels().get(i).getFlat() == false) {
                car.getWheels().get(i).setFlat(true);
            }
        }
    }

    public void refuel(Car car) {
       car.getGastank().setFueled(true);
    }
}