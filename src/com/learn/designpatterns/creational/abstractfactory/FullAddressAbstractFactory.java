package com.learn.designpatterns.creational.abstractfactory;

/**
 * AbstractFactory class.
 * This is the abstract class/interface that defines the methods for creating abstract generic classes.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 17/09/2018.
 * Time: 00:59
 */
public interface FullAddressAbstractFactory {

    Address createAddress();
    Phone createPhone();

}
