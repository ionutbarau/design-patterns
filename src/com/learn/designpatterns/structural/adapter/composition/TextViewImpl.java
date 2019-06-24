package com.learn.designpatterns.structural.adapter.composition;

/**
 * An implementation of Adaptee interface.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-24.
 * Time: 16:46
 */
public class TextViewImpl implements TextView {
    @Override
    public void writeText(String text) {
        System.out.println(text);
    }
}
