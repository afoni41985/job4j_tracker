package ru.job4j.stream;

import java.util.concurrent.Callable;

public class Car {
    private String modelName;
    private boolean broken;
    private String color;
    private String bodyType;
    private int doors;
    private int yearProduction;
    private String steeringWheel;

    @Override
    public String toString() {
        return "Car{"
                + "modelName='" + modelName + '\''
                + ", broken=" + broken
                + ", color='" + color + '\''
                + ", bodyType='" + bodyType + '\''
                + ", doors=" + doors
                + ", yearProduction=" + yearProduction
                + ", steeringWheel='" + steeringWheel + '\''
                + '}';
    }

    static class Builder {
        private String modelName;
        private boolean broken;
        private String color;
        private String bodyType;
        private int doors;
        private int yearProduction;
        private String steeringWheel;

        Builder buildModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        Builder buildBroken(boolean broken) {
            this.broken = broken;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Builder buildBodyType(String bodyType) {
            this.bodyType = bodyType;
            return this;
        }

        Builder buildDoors(int doors) {
            this.doors = doors;
            return this;
        }

        Builder buildProduction(int yearProduction) {
            this.yearProduction = yearProduction;
            return this;
        }

        Builder buildSteeringWheel(String steeringWheel) {
            this.steeringWheel = steeringWheel;
            return this;
        }

        Car build() {
            Car car = new Car();
            car.modelName = modelName;
            car.broken = broken;
            car.color = color;
            car.bodyType = bodyType;
            car.doors = doors;
            car.yearProduction = yearProduction;
            car.steeringWheel = steeringWheel;
            return car;
        }

    }

    public static void main(String[] args) {
        Car kia = new Builder()
                .buildModelName("Optima")
                .buildBroken(false)
                .buildColor("Black")
                .buildBodyType("Coupe")
                .buildDoors(2)
                .buildProduction(2017)
                .buildSteeringWheel("Left")
                .build();
        System.out.println(kia);
    }
}
