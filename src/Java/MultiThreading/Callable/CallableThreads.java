package Java.MultiThreading.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class CallableThreads implements Callable<String> {

    String context;

    CallableThreads(String context){
        this.context = context;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000*2);
        return context;
    }
}
