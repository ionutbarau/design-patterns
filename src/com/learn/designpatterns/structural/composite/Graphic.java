package com.learn.designpatterns.structural.composite;

/**
 * The Component class that declares the interfaces for objects in the composition.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-26.
 * Time: 20:42
 */
public abstract class Graphic {

    public abstract void draw();

    public void addGraphic(Graphic g){
        throw new RuntimeException("This operation is not supported on this Graphic type");
    }

    public void removeGraphic(Graphic g){
        throw new RuntimeException("This operation is not supported on this Graphic type");
    }

    public Graphic getChildGraphic(int position){
        throw new RuntimeException("This operation is not supported on this Graphic type");
    }
}
