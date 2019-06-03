package com.learn.designpatterns.creational.abstractfactory;

/**
 * Concrete implementation of Abstract Factory.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 17/09/2018.
 * Time: 12:35
 */
public class RoFullAddressFactory implements FullAddressAbstractFactory {

    private static RoFullAddressFactory INSTANCE = null;

    private RoFullAddressFactory(){

    }

    @Override
    public Address createAddress() {
        return new RoAddress("My street", 1, "123456");
    }

    @Override
    public Phone createPhone() {
        return new RoPhone("755453110");
    }

    public static RoFullAddressFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new RoFullAddressFactory();
        }
        return INSTANCE;
    }
}
