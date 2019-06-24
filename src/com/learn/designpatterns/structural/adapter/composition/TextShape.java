package com.learn.designpatterns.structural.adapter.composition;

/**
 * The Adapter class that adapts TextView to Shape interface
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-24.
 * Time: 16:42
 */
public class TextShape implements Shape{

    private TextView textView = new TextViewImpl();

    @Override
    public void draw() {
        //The draw() method uses the Adaptee interface in order to do it's job.
        textView.writeText("Add your text here");
    }


}
