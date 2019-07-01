package com.learn.designpatterns.structural.decorator;

/**
 * The ConcreteDecorator class defines specific decorations.
 */
public class BorderDecorator extends Decorator{

    private int borderWidth;

    public BorderDecorator(VisualComponent component, int borderWidth) {
        super(component);
        this.borderWidth = borderWidth;
    }

    /**
     * Decorator method
     */
    private void drawBorder(){
        System.out.println("Drawing " + borderWidth + " px border");
    }

    @Override
    public void draw() {
        //do the decoration
        drawBorder();
        //forward the request to the component
        super.draw();
    }
}
