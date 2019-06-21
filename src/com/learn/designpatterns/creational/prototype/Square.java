package com.learn.designpatterns.creational.prototype;

import java.util.Objects;

/**
 * Concrete prototype class.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-21.
 * Time: 10:29
 */
public class Square extends Shape {

    private String title = "SQUARE";

    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Objects.equals(title, square.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
