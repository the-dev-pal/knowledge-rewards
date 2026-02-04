package LLD.DesignPatterns.Creational.FactoryPattern;

public class HomeLoanFactory implements LoanFactory{
    @Override
    public Loan getLoan() {
        return new HomeLoan();
    }
}
