package DesignPatterns.CreationalPatterns.SingletonPattern;

import java.time.LocalDateTime;

// This singleton pattern doesn't work in multithreaded environment.
// For this we need to design thread safe singleton class
public final class SingleThreadedAccount {
    private String accountNumber;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isActive;

    private static SingleThreadedAccount instance;

    private SingleThreadedAccount(){
    }

    public static SingleThreadedAccount getInstance(){
        if (instance == null)
            instance = new SingleThreadedAccount();

        return instance;
    }
}
