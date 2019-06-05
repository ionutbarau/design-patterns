package com.learn.designpatterns.creational.builder.v2;

/**
 * This class contains the product and the builder
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-05.
 * Time: 17:17
 */
public final class Car {
    //Fields are immutable
    private final int doors;
    private final String color;
    private final String traction;

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public String getTraction() {
        return traction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", color='" + color + '\'' +
                ", traction='" + traction + '\'' +
                '}';
    }


    /**
     * Private constructor called by the builder
     * @param builder
     */
    private Car(CarBuilder builder){
        doors = builder.doors;
        color = builder.color;
        traction = builder.traction;
    }

    public static class CarBuilder{
        private int doors;
        private String color;
        private String traction;

        public CarBuilder withDoors(int doors){
            this.doors = doors;
            return this;
        }

        public CarBuilder withColor(String color){
            this.color = color;
            return this;
        }

        public CarBuilder withTraction(String traction){
            this.traction = traction;
            return this;
        }

        /**
         * Build the car by calling it's private constructor
         * @return
         */
        public Car build(){
            return new Car(this);
        }
    }
}
