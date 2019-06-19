package com.learn.designpatterns.creational.factorymethod.v2;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-19.
 * Time: 22:38
 */
public class DefaultService implements Service {
    @Override
    public void postConstruct() {
        System.out.println("Running default service postConstruct");
    }

    @Override
    public void preDestroy() {
        System.out.println("Running default service preDestroy");
    }
}
