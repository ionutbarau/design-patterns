package com.learn.designpatterns.creational.abstractfactory;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-03.
 * Time: 21:19
 */
public class USFullAddressFactory implements FullAddressAbstractFactory {

    private static USFullAddressFactory INSTANCE = null;

    private USFullAddressFactory(){}

    @Override
    public Address createAddress() {
        return new USAddress("US My street", 1, "123456");
    }

    @Override
    public Phone createPhone() {
        return new USPhone("12345");
    }

    public static USFullAddressFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new USFullAddressFactory();
        }
        return INSTANCE;
    }
}
