/*
 * Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 * Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */

package by.java_online.module04.aggregation_and_composition.task02.main;

import by.java_online.module04.aggregation_and_composition.task02.entity.Car;
import by.java_online.module04.aggregation_and_composition.task02.logic.CarLogic;
import by.java_online.module04.aggregation_and_composition.task02.entity.Engine;
import by.java_online.module04.aggregation_and_composition.task02.entity.Wheel;
import by.java_online.module04.aggregation_and_composition.task02.view.CarView;

public class Main {
    public static void main(String[] args) {
        CarLogic logic = new CarLogic();
        CarView view = new CarView();

        Car car = new Car("Range Rover Autobiography");

        car.setEngine(new Engine(2993.00));
        car.getGastank().setFueled(false);

        car.getWheels().add(new Wheel(true));
        car.getWheels().add(new Wheel(false));
        car.getWheels().add(new Wheel(true));

        System.out.println("First try to drive a car ->");
        logic.ride(car);

        logic.refuel(car);
        logic.replaceWheel(car);

        System.out.println("Second try to drive a car ->");
        logic.ride(car);

        car.getWheels().add(new Wheel(true));

        System.out.println("Third try to drive a car ->");
        logic.ride(car);

        view.printCarModel(car);
    }
}
