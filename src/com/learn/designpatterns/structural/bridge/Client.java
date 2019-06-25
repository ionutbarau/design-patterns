package com.learn.designpatterns.structural.bridge;

/**
 * The Client that uses the Abstraction
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-25.
 * Time: 19:59
 */
public class Client {

    public static void main(String[] args){
        //The color could be provided at runtime without client knowing about it
        Shape greenShape = new Triangle(new GreenColor());
        Shape redShape = new Triangle(new RedColor());

        greenShape.applyColor();
        System.out.println();
        redShape.applyColor();

    }
}
