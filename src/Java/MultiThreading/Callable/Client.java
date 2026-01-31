package Java.MultiThreading.Callable;

import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        CallableThreads ct = new CallableThreads("Result from future");

        Future<String> futureResult = executorService.submit(ct);

        System.out.println("Proceeding further instead of waiting...");

        System.out.println(futureResult.get());

        executorService.shutdown();

    }

}
