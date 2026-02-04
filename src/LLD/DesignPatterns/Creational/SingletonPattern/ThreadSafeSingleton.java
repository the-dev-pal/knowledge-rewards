package LLD.DesignPatterns.Creational.SingletonPattern;

/*
    This method uses an inner static helper class to create the Singleton instance.
    It is considered the most efficient way to implement the Singleton pattern
    because it is thread-safe and does not require synchronization.
*/
public class ThreadSafeSingleton {

    private ThreadSafeSingleton(){}

    private static class SingletonHelper{
        private static final ThreadSafeSingleton instance = new ThreadSafeSingleton();
    }

    public static ThreadSafeSingleton getInstance(){
        return SingletonHelper.instance;
    }

}
