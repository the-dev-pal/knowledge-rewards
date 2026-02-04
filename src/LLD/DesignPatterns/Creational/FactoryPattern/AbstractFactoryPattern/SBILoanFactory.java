package LLD.DesignPatterns.Creational.FactoryPattern.AbstractFactoryPattern;

public class SBILoanFactory implements LoanFactory{
    @Override
    public Loan getLoan() {
        return new SBILoan();
    }
}
