package Java.MultiThreading.AdderSubtractorAtomicDS;

public class Substractor implements Runnable{

    Count count;

    Substractor(Count count){
        this.count = count;
    }

    @Override
    public void run() {
        for (int i=1;i<10000;i++){
            count.value.decrementAndGet();
        }
    }
}
