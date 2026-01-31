package Java.MultiThreading.ProducerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{
    private Queue<Object> queue;

    private int maxSize;

    Consumer(Queue<Object> queue, int maxSize){
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true){
            synchronized (queue) {
                if (!queue.isEmpty()) {
                    queue.remove();
                    System.out.println(queue.size());
                }
            }
        }
    }
}
