package LLD.DesignPatterns.Creational.FactoryPattern;

public class HomeLoan implements Loan{
    @Override
    public boolean checkEligibility() {
        return false;
    }
}
