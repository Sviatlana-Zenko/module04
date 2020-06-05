package by.java_online.module04.aggregation_and_composition.task02.view;

import by.java_online.module04.aggregation_and_composition.task02.entity.Car;

public class CarView {
    public void printCarModel(Car car) {
        System.out.println("Car model - " + car.getModel());
    }
}
