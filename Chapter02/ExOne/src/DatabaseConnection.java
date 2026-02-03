package singleton;

public class DatabaseConnection {

    // biến static lưu instance duy nhất
    private static DatabaseConnection instance;

    // constructor private
    private DatabaseConnection() {
        System.out.println("Database connected");
    }

    // PHẢI là public static
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
