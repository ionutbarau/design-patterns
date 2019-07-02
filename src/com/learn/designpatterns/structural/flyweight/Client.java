package com.learn.designpatterns.structural.flyweight;

public class Client {

    public static void main(String[] args){
        GlyphContext context = new GlyphContext();
        GlyphFactory factory = new GlyphFactory();

        Glyph a = factory.createCharacter('a');
        a.setColor("RED", context);
        a.setSize(22, context);
        a.draw(context);
        Glyph b = factory.createCharacter('b');
        b.draw(context);
        Glyph c = factory.createCharacter('c');
        c.setColor("BLUE", context);
        c.setSize(24, context);
        c.draw(context);
        Glyph a1 = factory.createCharacter('a');
        a1.draw(context);

        System.out.println("Are a chars equal ? " + (a == a1));
    }
}
