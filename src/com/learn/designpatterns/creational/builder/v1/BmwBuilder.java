package com.learn.designpatterns.creational.builder.v1;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-04.
 * Time: 22:27
 */
public class BmwBuilder implements CarBuilder {

    private Car carTmp = new Car();

    @Override
    public Car build() {
        Car c  = new Car();
        c.setColor(carTmp.getColor());
        c.setDoors(c.getDoors());
        return c;
    }

    @Override
    public CarBuilder setColor(final String color) {
        carTmp.setColor(color);
        return this;
    }

    @Override
    public CarBuilder setDoors(final int doors) {
        carTmp.setDoors(doors);
        return this;
    }
}
