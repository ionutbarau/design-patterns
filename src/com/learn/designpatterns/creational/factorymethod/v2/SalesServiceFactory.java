package com.learn.designpatterns.creational.factorymethod.v2;

/**
 * Concrete creator class that implements the factory method
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-19.
 * Time: 22:28
 */
public class SalesServiceFactory extends ServiceFactory {
    @Override
    public Service loadService() {
        return new SalesService();
    }
}
