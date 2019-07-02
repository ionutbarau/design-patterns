package com.learn.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Creates and maintains a repository of flyweights that are shared. It is also responsible for creating non-shared flyweights.
 */
public class GlyphFactory {
    //The flyweights map
    private Map<java.lang.Character, CharacterGlyph> characters = new HashMap<>();

    /**
     * Creates a character if it is not already in the map.
     * @param c
     * @return the character glyph
     */
    public CharacterGlyph createCharacter(char c){
        CharacterGlyph existing = characters.get(c);
        if(existing == null){
            existing = new CharacterGlyph(c);
            characters.put(c,existing);
        }
        return existing;
    }


}
