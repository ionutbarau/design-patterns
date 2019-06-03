package com.learn.designpatterns.creational.abstractfactory;

/**
 * Concrete implementation of Address generic class.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 17/09/2018.
 * Time: 12:34
 */
public class RoAddress extends Address {

    public RoAddress(String street, Integer number, String postCode) {
        super(street, number, postCode);
    }

    @Override
    public String getPostCode() {
       return "RO" + super.getPostCode();
    }
}
