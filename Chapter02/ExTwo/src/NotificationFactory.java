package factory;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }
        return null;
    }
}
