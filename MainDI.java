package di;

public class MainDI {
    public static void main(String[] args) {

        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.notifyUser("Hello Email");

        notification.setMessageService(new SMSService());
        notification.notifyUser("Hello SMS");
    }
}
