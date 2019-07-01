package com.learn.designpatterns.structural.decorator;

/**
 * The Decorator class that keeps a reference to a Component and implements the Component interface.
 * It decorates the component. For each operation defined in the Component interface, the Decorator defines a default
 * implementation that passes the request to it's underlying component.
 */
public abstract class Decorator implements VisualComponent{

    private VisualComponent component;

    public Decorator(VisualComponent component){
        this.component = component;
    }

    @Override
    public void draw() {
        //forwards the request to the component
        component.draw();
    }
}
