package solid_principles.single_responsibility_principle;

public class NotificationService {
    public void sendOTP(String medium){
        if(medium.equals("email")){
            // email related logic
            // use java mail sender
        }
        else if(medium.equals("mobile")) {
            // write logic using twilio API
        }
    }
}
