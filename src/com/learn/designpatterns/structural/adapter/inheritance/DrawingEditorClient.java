package com.learn.designpatterns.structural.adapter.inheritance;

/**
 * The client that uses the Target interface.
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-24.
 * Time: 17:10
 */
public class DrawingEditorClient {

    public static void main(String[] args){
        Shape shape = new TextShape();
        shape.draw();
    }
}
