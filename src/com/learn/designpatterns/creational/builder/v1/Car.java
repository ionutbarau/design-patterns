package com.learn.designpatterns.creational.builder.v1;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-04.
 * Time: 22:47
 */
public class Car {

    private String color;
    private int doors;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doors=" + doors +
                '}';
    }
}
