package com.learn.designpatterns.creational.singleton;

/**
 * The Singleton class that produces a single instance
 * User: Ionut Barau (ionutbarau)
 * Project: design-patterns
 * Date: 2019-06-21.
 * Time: 20:46
 */
public class Singleton {

    private static Singleton INSTANCE;

    /**
     * This class cannot be instantiated by clients
     */
    private Singleton(){

    }


    public void print(){
        System.out.println("Singleton print method called");
    }

    /**
     * For thread safety there is a need to synchronize on the class.
     * Between the first if and the second, there is a chance that 2 threads are accessing this method concurrently,
     * resulting in 2 instances if we do not synchronize.
     * @return
     */
    public static Singleton getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton.class) {
                if (INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }


}

