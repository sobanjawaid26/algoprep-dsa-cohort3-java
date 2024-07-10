package solid_principles.dependency_inversion_principle;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard){
        this.bankCard = bankCard;
    }

    public void purchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        CreditCard creditCard = new CreditCard();

        BankCard bankCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.purchaseSomething(5000);
    }
}
