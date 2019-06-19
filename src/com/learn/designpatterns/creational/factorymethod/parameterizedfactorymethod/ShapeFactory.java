package com.learn.designpatterns.creational.factorymethod.parameterizedfactorymethod;

/**
 * Class that contains the parameterized factory method.
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-19.
 * Time: 22:15
 */
public class ShapeFactory {

    //This could have been made static and called a static factory method(private constructor would have been needed also)
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}
