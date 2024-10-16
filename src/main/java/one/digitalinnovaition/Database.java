package one.digitalinnovaition;

public class Database {

    public static void startConnection() {
        System.out.println("Started connection.");
    }

    public static void closeConnection() {
        System.out.println("Closed connection.");
    }

    public static void insertData(Person person) {
        System.out.println("Inserted data.");
    }

    public static void removeData(Person person) {
        System.out.println("Removed data.");
    }
}
