package Java.MultiThreading.Semaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Object> queue;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    private int maxSize;

    Consumer(Queue<Object> queue, int maxSize, Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.queue = queue;
        this.maxSize = maxSize;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true){
            try {
                consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (!queue.isEmpty()) {
                System.out.println("Consumer: " + Thread.currentThread().getName());
                queue.remove();
                System.out.println(queue.size());
            }
            producerSemaphore.release();
        }
    }
}
