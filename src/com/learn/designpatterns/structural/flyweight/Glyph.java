package com.learn.designpatterns.structural.flyweight;

/**
 * The Flyweight interface that can act on extrinsic state (GlyphContext).
 */
public abstract class Glyph {

    public abstract void draw(GlyphContext context);

    public void setColor(String color, GlyphContext context){
        context.setColor(color);
    }

    public void setSize(int size, GlyphContext context){
        context.setSize(size);
    }




}
