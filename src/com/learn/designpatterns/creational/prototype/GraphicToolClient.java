package com.learn.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * The client that creates objects based on loaded prototypes.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-21.
 * Time: 10:28
 */
public class GraphicToolClient {

   //A registry(cache) of concrete prototypes is needed. Think of it a dynamic binding
    public static Map<String,Shape> shapes = new HashMap<>();

    static {
        //Fill the cache with clones
        shapes.put("circle", new Circle());
        shapes.put("square", new Square());
    }

    public static void main(String[] args){



        Shape square =(Square) shapes.get("square").clone();
        square.draw();
        System.out.println("is deep clone = " +  (shapes.get("square") != square));
        System.out.println("are objects equal = " +  (shapes.get("square").equals(square)));

        Shape circle =(Circle) shapes.get("circle").clone();
        circle.draw();
        System.out.println("is deep clone = " +  (shapes.get("circle") != circle));
        System.out.println("are objects equal = " +  (shapes.get("circle").equals(circle)));

    }
}
