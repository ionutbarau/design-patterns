package com.learn.designpatterns.creational.factorymethod.v2;

/**
 * Concrete service class (concrete product)
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-19.
 * Time: 22:30
 */
public class UserService implements Service {
    @Override
    public void postConstruct() {
        System.out.println("Running user service postConstruct");
    }

    @Override
    public void preDestroy() {
        System.out.println("Running user service preDestroy");
    }
}
