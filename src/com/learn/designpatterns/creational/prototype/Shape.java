package com.learn.designpatterns.creational.prototype;

/**
 * The Prototype class/interface that defines the clone method.
 * By extending Cloneable interface, the Object.clone() method can be used for cloning.
 * It needs to get overridden in subclasses
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-21.
 * Time: 10:28
 */
public abstract class Shape implements Cloneable{

    public abstract void draw();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

}
