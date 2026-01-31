package Java.MultiThreading.Runnable;

public class RunnableThreads implements Runnable{

    int count;

    RunnableThreads(int count){
        this.count = count;
    }

    @Override
    public void run() {
        //Task
        for (int i=0;i<10;i++){
            count = i;
            System.out.println(Thread.currentThread().getName() + ": " +count);
        }
    }
}
