package com.learn.designpatterns.creational.factorymethod.v2;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-19.
 * Time: 22:33
 */
public class Client {

    public static void main(String[] args){

        ServiceFactory serviceFactory = new ServiceFactory();
        Service defaultService = serviceFactory.loadService();
        defaultService.postConstruct();
        defaultService.preDestroy();

        ServiceFactory salesServiceFactory = new SalesServiceFactory();
        Service salesService = salesServiceFactory.loadService();
        salesService.postConstruct();
        salesService.preDestroy();

        ServiceFactory userServiceFactory = new UserServiceFactory();
        Service userService = userServiceFactory.loadService();
        userService.postConstruct();
        userService.preDestroy();
    }
}
