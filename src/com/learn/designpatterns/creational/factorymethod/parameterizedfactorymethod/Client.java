package com.learn.designpatterns.creational.factorymethod.parameterizedfactorymethod;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-19.
 * Time: 22:16
 */
public class Client {

    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("SQUARE").draw();
    }
}
