package one.digitalinnovaition;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class SearchPersonDataTest {

    Person person = new Person("Bruno", LocalDateTime.of(2000, 1, 1, 15, 0, 0));

    @BeforeAll
    public static void configureConnection() {
        Database.startConnection();
    }

    @BeforeEach
    public void insertData() {
        Database.insertData(person);
    }

    @AfterEach
    public void removeData() {
        Database.removeData(person);
    }

    @Test
    public void validReturnData() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    public static void closeConnection() {
        Database.closeConnection();
        System.out.println("It ran and closed the connection.");
    }
}
