package com.learn.designpatterns.structural.decorator;

/**
 * The Concrete Component that will be decorated.
 */
public class TextView implements VisualComponent {

    @Override
    public void draw() {
        System.out.println("Drawing a textview");
    }
}
