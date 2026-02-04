package LLD.DesignPatterns.Creational.FactoryPattern.AbstractFactoryPattern;

public class SBILoan implements Loan{
    @Override
    public boolean checkEligibility() {
        return false;
    }
}
