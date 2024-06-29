package solid_principles.open_close_principle;

public interface NotificationService {

    void sendOTP(String medium);

    void sendTransactionReport(String medium);
}
