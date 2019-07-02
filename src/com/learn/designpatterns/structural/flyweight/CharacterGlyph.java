package com.learn.designpatterns.structural.flyweight;

/**
 * The concrete flyweight that needs to be shared. Stores intrinsic state.
 */
public class CharacterGlyph extends Glyph {

    /**
     * Intrinsic state
     */
    private char c;

    public CharacterGlyph(char c){
        this.c = c;
    }

    @Override
    public void draw(GlyphContext context) {
        System.out.println(c + "(size = " + context.getSize() + " and color = " + context.getColor() +  ")");
    }

}
