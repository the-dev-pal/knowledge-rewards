package LLD.DesignPatterns.Creational.FactoryPattern.AbstractFactoryPattern;

public class HDFCLoanFactory implements LoanFactory{
    @Override
    public Loan getLoan() {
        return new HDFCLoan();
    }
}
