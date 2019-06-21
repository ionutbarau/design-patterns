package com.learn.designpatterns.creational.singleton;

/**
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-21.
 * Time: 21:26
 */
public class Client {

    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if(singleton1 == singleton2){
            System.out.println("Same instance");
        } else {
            System.out.println("Ooops ... different instance");
        }


    }
}
