package solid_principles.interface_segregation_principle;

public class GooglePay implements UPIPayments, CashBackManager{
    @Override
    public void getCashBackAsCreditBalance() {

    }

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
}
