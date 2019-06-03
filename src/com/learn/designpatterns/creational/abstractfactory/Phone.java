package com.learn.designpatterns.creational.abstractfactory;

/**
 * The abstract generic Phone class that will be extended by concrete implementations.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 17/09/2018.
 * Time: 12:33
 */
public abstract class Phone {

    private String phoneNumber;


    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
