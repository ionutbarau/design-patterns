package com.learn.designpatterns.structural.bridge;

/**
 * The ConcreteImplementor class
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-25.
 * Time: 19:56
 */
public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.print("RED");
    }
}
