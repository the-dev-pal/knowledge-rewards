package Java.MultiThreading.Runnable;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args){

        RunnableThreads rt = new RunnableThreads(1);
        Thread t1 = new Thread(rt);
 // This way we need to create the threads manually
//        t1.start();

 // Executors will handle the creations of threads and reuse the existing resources
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(rt);

        executorService.shutdown();

    }

}
