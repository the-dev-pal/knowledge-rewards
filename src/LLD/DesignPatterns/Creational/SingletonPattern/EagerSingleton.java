package LLD.DesignPatterns.Creational.SingletonPattern;

import java.time.LocalDateTime;

// Eager initialization approach
// This singleton pattern doesn't work in multithreaded environment.
// For this we need to design thread safe singleton class
public class EagerSingleton {

    /* Eager Initialization, meaning at the time of class loading instance will be created.
       If this instance is never used, it will lead to resource wastage.
    */
    // This should be static as this needs to be accessible in the static method.
    private static final EagerSingleton instance =
            new EagerSingleton();

    // private constructor to prevent instantiation, can't be accessible outside the class
    private EagerSingleton(){
    }

    // This method must be static to make a call without instance of the class.
    public static EagerSingleton getInstance(){
        /*
           Lazy Initialization, meaning whenever the object is required then only
           object will be instantiated.
        */
        return instance;
    }

}
