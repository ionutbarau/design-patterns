package com.learn.designpatterns.creational.abstractfactory;

/**
 * This is class will be used by clients to create the right factory.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 17/09/2018.
 * Time: 14:16
 */
public class FullAddressFactoryProducer {

    public static FullAddressAbstractFactory getFactory(String countryCode){
        if(countryCode.equals("RO")){
            return RoFullAddressFactory.getInstance();
        }

        if(countryCode.equals("US")){
            return USFullAddressFactory.getInstance();
        }
        return null;
    }
}
