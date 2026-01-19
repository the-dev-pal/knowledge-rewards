package LLD.DesignPatterns.CreationalPatterns.BuilderPattern;

import java.time.LocalDateTime;

public class Account {
    private String accountNumber;
    private String name;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean isActive;

    private Account(AccountBuilder accountBuilder){
        this.accountNumber = accountBuilder.getAccountNumber();
        this.name = accountBuilder.getName();
        this.createdAt = accountBuilder.getCreatedAt();
        this.updatedAt = accountBuilder.getUpdatedAt();
        this.isActive = accountBuilder.isActive();
    }

    public static AccountBuilder getAccountBuilder(){
        return new AccountBuilder();
    }

    public static class AccountBuilder{
        private String accountNumber;
        private String name;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private boolean isActive;

        // Getters
        public String getAccountNumber() {
            return accountNumber;
        }

        public String getName() {
            return name;
        }

        public LocalDateTime getCreatedAt() {
            return createdAt;
        }

        public LocalDateTime getUpdatedAt() {
            return updatedAt;
        }

        public boolean isActive() {
            return isActive;
        }

        // Setters
        public AccountBuilder setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public AccountBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AccountBuilder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public AccountBuilder setUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public AccountBuilder setActive(boolean active) {
            isActive = active;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", isActive=" + isActive +
                '}';
    }
}
