package solid_principles.dependency_inversion_principle;

public class DebitCard implements BankCard{
    @Override
    public void doTransaction(long amount) {
        System.out.println("Payment using Debit card");
    }
}
