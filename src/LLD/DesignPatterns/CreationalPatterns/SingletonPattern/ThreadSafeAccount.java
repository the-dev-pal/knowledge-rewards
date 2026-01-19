package LLD.DesignPatterns.CreationalPatterns.SingletonPattern;

import java.time.LocalDateTime;

public final class ThreadSafeAccount {
    private String accountNumber;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isActive;

    // The field must be declared volatile so that double check lock would work correctly.
    private static volatile ThreadSafeAccount instance;

    private ThreadSafeAccount(){
    }

    // The approach taken here is called double-checked locking (DCL). It
    // exists to prevent race condition between multiple threads that may
    // attempt to get singleton instance at the same time, creating separate
    // instances as a result.
    //
    // It may seem that having the `result` variable here is completely
    // pointless. There is, however, a very important caveat when
    // implementing double-checked locking in Java, which is solved by
    // introducing this local variable.
    public static ThreadSafeAccount getInstance(){
        ThreadSafeAccount threadSafeAccount = instance;
        if (threadSafeAccount != null)
            return instance;

        synchronized (ThreadSafeAccount.class) {
            if (instance == null)
                instance = new ThreadSafeAccount();

            return instance;
        }

    }
}
