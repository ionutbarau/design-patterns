package com.learn.designpatterns.creational.builder.v2;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-05.
 * Time: 18:34
 */
public class Client {

    public static void main(String[] args){
        Car bmw = new Car.CarBuilder().withColor("silver").withDoors(4).withTraction("Xdrive").build();
        System.out.println(bmw);
    }
}
