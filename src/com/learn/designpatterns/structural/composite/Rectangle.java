package com.learn.designpatterns.structural.composite;

/**
 * Leaf class that has no children and implements operation for Component besides the one for manipulating children.
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-26.
 * Time: 20:51
 */
public class Rectangle extends Graphic {

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
