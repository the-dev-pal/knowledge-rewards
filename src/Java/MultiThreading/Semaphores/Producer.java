package Java.MultiThreading.Semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Queue<Object> queue;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    private int maxSize;

    Producer(Queue<Object> queue, int maxSize, Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.queue = queue;
        this.maxSize = maxSize;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true){
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (queue.size() < maxSize) {
                System.out.println("Producer: " + Thread.currentThread().getName());
                queue.add(new Object());
                System.out.println(queue.size());
            }
            consumerSemaphore.release();
        }
    }
}
