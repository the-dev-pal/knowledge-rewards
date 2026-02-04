package LLD.DesignPatterns.Creational.FactoryPattern.AbstractFactoryPattern;

public class HDFCLoan implements Loan{
    @Override
    public boolean checkEligibility() {
        return false;
    }
}
