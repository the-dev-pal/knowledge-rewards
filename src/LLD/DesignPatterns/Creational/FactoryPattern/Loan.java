package LLD.DesignPatterns.Creational.FactoryPattern;

// Product Interface
public interface Loan {
    double calculateInterestAmount(Account account);
    boolean loanEligibility(Account account);
}
