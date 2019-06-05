package com.learn.designpatterns.creational.builder.v1;

/**
 * The director that uses the builder for constructing products.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-04.
 * Time: 22:26
 */
public class CarDirector {

    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder){
        this.carBuilder = carBuilder;
    }

    public Car construct(){
        return carBuilder.paint("RED").assembleDoors(2).build();
    }
}
