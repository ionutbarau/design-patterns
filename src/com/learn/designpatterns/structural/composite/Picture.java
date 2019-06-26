package com.learn.designpatterns.structural.composite;

import com.learn.designpatterns.structural.composite.Graphic;

import java.util.LinkedList;
import java.util.List;

/**
 * The Composite class that implements all the child operations and delegates call to the children.
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-26.
 * Time: 20:46
 */
public class Picture extends Graphic {

    private List<Graphic> children = new LinkedList<>();

    @Override
    public void draw() {
        System.out.println("--Started drawing a picture");
        children.forEach((g) ->{
            g.draw();
        });
        System.out.println("--Finished drawing a picture");
    }

    @Override
    public void addGraphic(Graphic g){
        children.add(g);
    }

    @Override
    public void removeGraphic(Graphic g){
        children.remove(g);
    }

    @Override
    public Graphic getChildGraphic(int position){
        return children.get(position);
    }
}
