package solid_principles.single_responsibility_principle;

public class LoanService {

    public  void getLoadInterestInfo(String loanType){
        if(loanType.equals("homeLoan")) {
            //home loan interest
        } else if(loanType.equals("personalLoan")){
            // personal Loan interest
        } else if(loanType.equals("car")){
            // car loan interest
        }
    }
}
