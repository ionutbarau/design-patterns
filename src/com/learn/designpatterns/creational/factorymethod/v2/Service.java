package com.learn.designpatterns.creational.factorymethod.v2;

/**
 * The abstract product
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-19.
 * Time: 22:20
 */
public interface Service {

    void postConstruct();
    void preDestroy();
}
