package solid_principles.single_responsibility_principle;

public class BankService {

    public long deposit(long amount, String accountNo){
        // deposit amount
        return 0;
    }
    public long withDraw(long amount, String accountNo){
        // withdraw amount
        return 0;
    }
    /*
    public  void getLoadInterestInfo(String loanType){
        if(loanType.equals("homeLoan")) {
            //home loan interest
        } else if(loanType.equals("personalLoan")){
            // personal Loan interest
        } else if(loanType.equals("car")){
            // car loan interest
        }
    }

    public void sendOTP(String medium){
        if(medium.equals("email")){
            // email related logic
            // use java mail sender
        }
        else if(medium.equals("mobile")) {
            // write logic using twilio API
        }
    }

    public void printPassbook(){
        // update transaction info in passbook
    }
     */
}
