package com.learn.designpatterns.structural.adapter.inheritance;

/**
 * The Adapter class that adapts TextView to Shape interface.
 * Extends the Adaptee class and implements the Target Interface.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-24.
 * Time: 16:42
 */
public class TextShape extends TextView implements Shape {


    @Override
    public void draw() {
        //The draw() method uses the Adaptee implementation to do it's job.
        writeText("Add your text here");
    }





}
