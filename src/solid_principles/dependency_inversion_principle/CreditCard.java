package solid_principles.dependency_inversion_principle;

public class CreditCard implements BankCard{


    @Override
    public void doTransaction(long amount) {
        System.out.println("payment using credit card");
    }
}
