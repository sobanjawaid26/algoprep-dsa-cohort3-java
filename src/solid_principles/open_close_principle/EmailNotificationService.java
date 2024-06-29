package solid_principles.open_close_principle;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendOTP(String medium) {
        // write logic to integrate with EMAIL api
    }

    @Override
    public void sendTransactionReport(String medium) {
        // write logic to integrate with EMAIL api
    }
}
