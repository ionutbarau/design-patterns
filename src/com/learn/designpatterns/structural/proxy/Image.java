package com.learn.designpatterns.structural.proxy;

/**
 * The RealSubject class that the Proxy stand in for.
 */
public class Image implements Graphic {
    @Override
    public void draw() {
        System.out.println("Drawing the real image");
    }

    @Override
    public int getSize() {
        return 5000;
    }
}
