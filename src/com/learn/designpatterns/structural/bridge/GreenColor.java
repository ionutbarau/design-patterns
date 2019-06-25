package com.learn.designpatterns.structural.bridge;

/**
 * ConcreteImplementor class.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-25.
 * Time: 19:58
 */
public class GreenColor implements Color{
    @Override
    public void applyColor() {
        System.out.print("GREEN");
    }
}
