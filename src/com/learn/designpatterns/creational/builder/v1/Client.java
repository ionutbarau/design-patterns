package com.learn.designpatterns.creational.builder.v1;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-05.
 * Time: 16:33
 */
public class Client {

    public static void main(String[] args){
        CarBuilder mercedesBuilder = new MercedesBuilder();
        CarBuilder bmwBuilder = new BmwBuilder();

        CarDirector director1 = new CarDirector(mercedesBuilder);
        System.out.println(director1.construct());

        CarDirector director2 = new CarDirector(bmwBuilder);
        System.out.println(director2.construct());
    }
}
