package com.learn.designpatterns.creational.builder.v1;

/**
 * The builder abstract interface.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-04.
 * Time: 22:27
 */
interface CarBuilder {
    Car build();

    CarBuilder setColor(final String color);

    CarBuilder setDoors(final int doors);

}
