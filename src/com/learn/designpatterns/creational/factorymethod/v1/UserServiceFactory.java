package com.learn.designpatterns.creational.factorymethod.v1;

/**
 * Concrete creator class that implements the factory method.
 *
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-19.
 * Time: 22:31
 */
public class UserServiceFactory implements ServiceFactory {
    @Override
    public Service loadService() {
        return new UserService();
    }
}
