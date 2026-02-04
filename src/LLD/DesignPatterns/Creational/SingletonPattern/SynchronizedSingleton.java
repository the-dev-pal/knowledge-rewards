package LLD.DesignPatterns.Creational.SingletonPattern;

import java.time.LocalDateTime;

// This works fine in Muti-Threaded environment
public final class SynchronizedSingleton {

    // The field must be declared volatile so that double check lock would work correctly.
    private static volatile SynchronizedSingleton instance;

    // private constructor to prevent instantiation, can't be accessible outside the class
    private SynchronizedSingleton(){
    }

    /*
     The approach taken here is called double-checked locking (DCL). It
     exists to prevent race condition between multiple threads that may
     attempt to get singleton instance at the same time, creating separate
     instances as a result.

     It may seem that having the `synchronizedSingleton` variable here is completely
     pointless. There is, however, a very important condition when
     implementing double-checked locking in Java, which is solved by
     introducing this local variable.
    */
    // This method must be static to make a call without instance of the class.
    public static SynchronizedSingleton getInstance(){
        SynchronizedSingleton synchronizedSingleton = instance;
        if (synchronizedSingleton != null)
            return instance;

        synchronized (SynchronizedSingleton.class) {
            if (instance == null)
                instance = new SynchronizedSingleton();

            return instance;
        }

    }
}
