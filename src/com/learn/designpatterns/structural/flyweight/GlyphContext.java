package com.learn.designpatterns.structural.flyweight;

/**
 * The Context that will be used to pass the extrinsic state to the flyweight. It acts as a repository for extrinsic state
 */
public class GlyphContext {

    private String color;

    private int size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
