package Java.MultiThreading.Semaphores;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Queue<Object> objects = new ConcurrentLinkedDeque<>();
        Semaphore producerSemaphore = new Semaphore(6);
        Semaphore consumerSemaphore = new Semaphore(0);

        Producer producer1 = new Producer(objects, 6, producerSemaphore, consumerSemaphore);
        Producer producer2 = new Producer(objects, 6, producerSemaphore, consumerSemaphore);
        Producer producer3 = new Producer(objects, 6, producerSemaphore, consumerSemaphore);

        Consumer consumer1 = new Consumer(objects, 6, producerSemaphore, consumerSemaphore);
        Consumer consumer2 = new Consumer(objects, 6, producerSemaphore, consumerSemaphore);
        Consumer consumer3 = new Consumer(objects, 6, producerSemaphore, consumerSemaphore);
        Consumer consumer4 = new Consumer(objects, 6, producerSemaphore, consumerSemaphore);
        Consumer consumer5 = new Consumer(objects, 6, producerSemaphore, consumerSemaphore);
        Consumer consumer6 = new Consumer(objects, 6, producerSemaphore, consumerSemaphore);

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
        Thread t7 = new Thread(consumer4);
        t7.start();
        Thread t8 = new Thread(consumer5);
        t8.start();
        Thread t9 = new Thread(consumer6);
        t9.start();
    }
}
