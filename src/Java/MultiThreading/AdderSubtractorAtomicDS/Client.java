package Java.MultiThreading.AdderSubtractorAtomicDS;

public class Client {

    public static void main(String[] args) throws InterruptedException {

        Count count = new Count();
        Adder adder = new Adder(count);
        Substractor substractor = new Substractor(count);

        Thread adderThread = new Thread(adder);
        Thread substactorThread = new Thread(substractor);

        adderThread.start();
        substactorThread.start();
        adderThread.join();
        substactorThread.join();

        System.out.println(count.value);

    }

}
