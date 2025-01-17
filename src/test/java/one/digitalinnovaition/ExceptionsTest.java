package one.digitalinnovaition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class ExceptionsTest {

    @Test
    public void validCenarioExceptionDuringTransfer() {
        Person person1 = new Person("Bruno", LocalDateTime.now());
        Person person2 = new Person("John", LocalDateTime.now());

        TransferBetweenPeople transferBetweenPeople = new TransferBetweenPeople();

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferBetweenPeople.transfer(person1, person2, -1));
        Assertions.assertDoesNotThrow(() -> transferBetweenPeople.transfer(person1, person2, 1));
    }
}
