package Java.MultiThreading.Callable;

import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        CallableThreads ct = new CallableThreads("Result from future");

        Future<String> futureResult = executorService.submit(ct);
        System.out.println("Proceeding further instead of waiting...");

        // to get the result of the computation, you must call the get() method,
        // which blocks the calling thread until the task is complete.
        // This can make your application less responsive, as it waits for the computation to finish
        System.out.println(futureResult.get());

        // to proceed further on remaining tasks, we need to wait till the result is returned from the thread.
        System.out.println("Remaining tasks...");

        executorService.shutdown();
    }

}
