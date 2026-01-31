package Java.MultiThreading.AdderSubtractorMuTex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(count, lock);
        Substractor substractor = new Substractor(count, lock);

        Thread adderThread = new Thread(adder);
        Thread substactorThread = new Thread(substractor);

        adderThread.start();
        substactorThread.start();
        adderThread.join();
        substactorThread.join();

        System.out.println(count.value);

    }

}
