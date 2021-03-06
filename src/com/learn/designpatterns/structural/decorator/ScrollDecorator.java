package com.learn.designpatterns.structural.decorator;

/**
 * The ConcreteDecorator class defines specific decorations.
 */
public class ScrollDecorator extends Decorator{

    private String direction;

    public ScrollDecorator(VisualComponent component, String direction) {
        super(component);
        this.direction = direction;
    }

    /**
     * Decorator method
     */
    private void scroll(){
        System.out.println("Scrolling " + direction);
    }

    @Override
    public void draw() {
        //do the decoration
        scroll();
        //forward the request to the component
        super.draw();
    }
}
