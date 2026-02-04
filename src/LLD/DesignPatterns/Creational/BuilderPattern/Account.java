package LLD.DesignPatterns.Creational.BuilderPattern;

import java.time.LocalDateTime;

public class Account {

    // required fields must be final
    private final long accountNumber;
    private final String name;
    // optional fields
    private String email;

    // constructor must be private, as this shouls be accessible from outside of this class
    private Account(AccountBuilder accountBuilder){
        this.accountNumber = accountBuilder.accountNumber;
        this.name = accountBuilder.name;
        this.email = accountBuilder.email;
    }

    public static class AccountBuilder{
        // required fields
        private final long accountNumber;
        private final String name;

        // optional fields
        private String email;

        // Constructor for required fields
        public AccountBuilder(long accountNumber, String name) {
            this.accountNumber = accountNumber;
            this.name = name;
        }

        // For optional fields
        public AccountBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
