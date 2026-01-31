package Java.MultiThreading.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Client {
    public static void main(String[] args) {
        Queue<Object> objects = new ConcurrentLinkedDeque<>();

        Producer producer1 = new Producer(objects, 6);
        Producer producer2 = new Producer(objects, 6);
        Producer producer3 = new Producer(objects, 6);

        Consumer consumer1 = new Consumer(objects, 6);
        Consumer consumer2 = new Consumer(objects, 6);
        Consumer consumer3 = new Consumer(objects, 6);

        Thread t1 = new Thread(producer1);
        t1.start();
        Thread t2 = new Thread(producer2);
        t2.start();
        Thread t3 = new Thread(producer3);
        t3.start();

        Thread t4 = new Thread(consumer1);
        t4.start();
        Thread t5 = new Thread(consumer2);
        t5.start();
        Thread t6 = new Thread(consumer3);
        t6.start();
    }
}
