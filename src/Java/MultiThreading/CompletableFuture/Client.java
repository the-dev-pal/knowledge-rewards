package Java.MultiThreading.CompletableFuture;

import Java.MultiThreading.Callable.CallableThreads;

import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) {

        CompletableFuture.supplyAsync(()-> {
                    return "Non-Blocking result";
                }
        ).thenApply(result -> result)
         .thenAccept(System.out::println);

    }

}
