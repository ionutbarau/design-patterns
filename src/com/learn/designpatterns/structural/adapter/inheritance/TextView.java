package com.learn.designpatterns.structural.adapter.inheritance;

/**
 * The Adaptee class that needs to be adapted to Target interface.
 * It will be extended by the Adaptor class.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-24.
 * Time: 16:41
 */
public class TextView {

    public void writeText(String text) {
        System.out.println(text);
    }
}
