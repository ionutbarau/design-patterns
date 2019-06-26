package com.learn.designpatterns.structural.composite;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-26.
 * Time: 20:52
 */
public class Client {

    public static void main(String[] args){
        Graphic line = new Line();
        Graphic rectangle = new Rectangle();
        Graphic picture = new Picture();
        picture.addGraphic(rectangle);
        picture.addGraphic(line);
        picture.draw();
        picture.getChildGraphic(0).draw();
        picture.removeGraphic(rectangle);
        picture.draw();

        line.draw();
        rectangle.draw();

        try{
            line.addGraphic(rectangle);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
