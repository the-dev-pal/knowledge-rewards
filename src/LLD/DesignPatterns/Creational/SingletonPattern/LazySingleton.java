package LLD.DesignPatterns.Creational.SingletonPattern;

import java.time.LocalDateTime;

// Lazy initialization approach
// This singleton pattern doesn't work in multithreaded environment.
// For this we need to design thread safe singleton class
public final class LazySingleton {

    private static LazySingleton instance;

    // private constructor to prevent instantiation, can't be accessible outside the class
    private LazySingleton(){
    }

    // This method must be static to make a call without instance of the class.
    public static LazySingleton getInstance(){
        /*
           Lazy Initialization, meaning whenever the object is required then only
           object will be instantiated.
        */
        if (instance == null)
            instance = new LazySingleton();

        return instance;
    }
}
