package Java.MultiThreading.AdderSubstractor;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();
        Adder adder = new Adder(count);
        Substractor substractor = new Substractor(count);

        Thread adderThread = new Thread(adder);
        Thread substactorThread = new Thread(substractor);

        adderThread.start();
        substactorThread.start();
        adderThread.join();
        substactorThread.join();

        System.out.println(count.value);

        // As the Count object is shared for both threads, we can't predict the result.
        // This means there is a synchronization issue in between the threads.

    }

}
