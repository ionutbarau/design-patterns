package com.learn.designpatterns.structural.bridge;

/**
 * The RefinedAbstraction class
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-25.
 * Time: 19:54
 */
public class Triangle extends Shape {


    public Triangle(Color color){
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle applying color : ");
        //Abstraction forwards client requests to its Implementor
        color.applyColor();
    }
}
