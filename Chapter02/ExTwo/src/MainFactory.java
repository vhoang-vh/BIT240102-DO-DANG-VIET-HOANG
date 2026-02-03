package factory;

public class MainFactory {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.createNotification("sms");
        n1.notifyUser();

        Notification n2 = NotificationFactory.createNotification("email");
        n2.notifyUser();
    }
}
