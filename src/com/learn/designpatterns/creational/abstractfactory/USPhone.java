package com.learn.designpatterns.creational.abstractfactory;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-03.
 * Time: 21:23
 */
public class USPhone extends Phone {

    public USPhone(String phoneNumber) {
        super(phoneNumber);
    }

    @Override
    public String getPhoneNumber() {
        return "+50" + super.getPhoneNumber();
    }
}
