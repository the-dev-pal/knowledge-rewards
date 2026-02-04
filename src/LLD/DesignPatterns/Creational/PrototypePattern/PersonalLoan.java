package LLD.DesignPatterns.Creational.PrototypePattern;

public class PersonalLoan implements Loan{
    @Override
    public boolean checkEligibility() {
        return false;
    }

    @Override
    public Loan clone() {
        try{
            return (PersonalLoan) super.clone();
        }catch (CloneNotSupportedException exception){
            return null;
        }
    }
}
