package com.learn.designpatterns.structural.proxy;

/**
 * The Subject class. Defines the common interface that the Proxy and RealSubject implement
 */
public interface Graphic {

    void draw();

    int getSize();
}
