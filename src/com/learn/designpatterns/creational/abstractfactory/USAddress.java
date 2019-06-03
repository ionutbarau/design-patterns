package com.learn.designpatterns.creational.abstractfactory;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-03.
 * Time: 21:20
 */
public class USAddress extends Address {

    public USAddress(String street, Integer number, String postCode) {
        super(street, number, postCode);
    }

    @Override
    public String getPostCode() {
        return "US" + super.getPostCode();
    }
}
