package LLD.DesignPatterns.CreationalPatterns.BuilderPattern;

public class Main {
    static void main(String[] args) {
        Account account1 = Account.getAccountBuilder()
                .setAccountNumber("ABCD123")
                .setName("ABCD")
                .build();

        System.out.println(account1);
    }
}
