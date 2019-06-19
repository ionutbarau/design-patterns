package com.learn.designpatterns.creational.factorymethod.v2;

/**
 * The abstract creator.
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-19.
 * Time: 22:21
 */
public class ServiceFactory {

    public Service loadService(){
        return new DefaultService();
    }
}
