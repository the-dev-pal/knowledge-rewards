package LLD.DesignPatterns.Creational.PrototypePattern;

public class HomeLoan implements Loan {

    @Override
    public boolean checkEligibility() {
        return false;
    }

    @Override
    public Loan clone() {
        try{
            return (HomeLoan)super.clone();
        }catch (CloneNotSupportedException exception){
            return null;
        }
    }
}
