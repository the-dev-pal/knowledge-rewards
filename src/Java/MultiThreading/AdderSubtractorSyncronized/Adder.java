package Java.MultiThreading.AdderSubtractorSyncronized;

public class Adder implements Runnable{

    Count count;

    Adder(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i=1;i<10000;i++){
            synchronized (count) { // Internally it is calling lock.lock() on count object
                count.value += i;
            }// lock.unlock()
        }
    }
}
