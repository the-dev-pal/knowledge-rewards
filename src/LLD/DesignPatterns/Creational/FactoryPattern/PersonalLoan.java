package LLD.DesignPatterns.Creational.FactoryPattern;

// Personal Loan Product
public class PersonalLoan implements Loan{
    @Override
    public double calculateInterestAmount(Account account) {
        return 1234.56;
    }

    @Override
    public boolean loanEligibility(Account account) {
        return account.isActive();
    }
}
