package com.learn.designpatterns.structural.bridge;

/**
 * The Abstraction class that holds a reference to the Implementor class Color.
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    public abstract void applyColor();
}
