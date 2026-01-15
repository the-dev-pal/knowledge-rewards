package DesignPatterns.CreationalPatterns.FactoryPattern;

public class Account {
    private String name;
    private String accountNumber;
    private boolean active;

    public Account(String name, String accountNumber, boolean active) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean isActive() {
        return active;
    }
}
