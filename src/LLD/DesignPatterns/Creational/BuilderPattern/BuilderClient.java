package LLD.DesignPatterns.Creational.BuilderPattern;

public class BuilderClient {

    public static void main(String[] args) {
        Account account = new Account.AccountBuilder(1234567, "xyz")
                .build();

        System.out.println("Account with required fields only: " + account);
    }

}
