package com.learn.designpatterns.creational.factorymethod.parameterizedfactorymethod;

/**
 * Concrete product class.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-19.
 * Time: 22:14
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
