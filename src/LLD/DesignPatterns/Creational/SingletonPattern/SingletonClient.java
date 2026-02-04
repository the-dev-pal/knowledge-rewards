package LLD.DesignPatterns.Creational.SingletonPattern;

public class SingletonClient {

    public static void main(String[] args) {

        // Using eager initialization
        EagerSingleton eagerInstance1 = EagerSingleton.getInstance();
        EagerSingleton eagerInstance2 = EagerSingleton.getInstance();
        /*
            Here the two instance's references are same in single threaded.
            But the instances are created at the class loading time.
        */
        System.out.println(eagerInstance1 + " : " + eagerInstance2);


        // Using lazy initialization
        LazySingleton lazyInstance1 = LazySingleton.getInstance();
        LazySingleton lazeInstance2 = LazySingleton.getInstance();
        /*
            Here as well two instance's references are same in single threaded.
            But the instances are created when the getinstance() is called.
        */
        System.out.println(eagerInstance1 + " : " + eagerInstance2);

        // Using Synchronized Singleton
        SynchronizedSingleton synchronizedInstance1 = SynchronizedSingleton.getInstance();

    }

}
