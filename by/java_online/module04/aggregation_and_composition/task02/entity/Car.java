package by.java_online.module04.aggregation_and_composition.task02.entity;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private List<Wheel> wheels;
    private Gastank gastank;

    public Car(String model) {
        this.model = model;
        engine = new Engine();
        wheels = new ArrayList<>(4);
        gastank = new Gastank(false);
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public Gastank getGastank() {
        return gastank;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public void setGastank(Gastank gastank) {
        this.gastank = gastank;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " { " +
                "model: " + model +
                ", engine: " + engine +
                ", wheels: " + wheels +
                ", gastank: " + gastank +
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((engine == null) ? 0 : engine.hashCode());
        result = prime * result + ((gastank == null) ? 0 : gastank.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
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
        Car other = (Car) obj;
        if (engine == null) {
            if (other.engine != null)
                return false;
        } else if (!engine.equals(other.engine))
            return false;
        if (gastank == null) {
            if (other.gastank != null)
                return false;
        } else if (!gastank.equals(other.gastank))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (wheels == null) {
            if (other.wheels != null)
                return false;
        } else if (!wheels.equals(other.wheels))
            return false;
        return true;
    }
}