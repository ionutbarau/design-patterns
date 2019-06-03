package com.learn.designpatterns.creational.abstractfactory;

/**
 * Concrete implementation of Phone generic class.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 17/09/2018.
 * Time: 12:35
 */
public class RoPhone extends Phone {

    public RoPhone(String phoneNumber) {
        super(phoneNumber);
    }

    @Override
    public String getPhoneNumber() {
        return "+40" + super.getPhoneNumber();
    }
}
