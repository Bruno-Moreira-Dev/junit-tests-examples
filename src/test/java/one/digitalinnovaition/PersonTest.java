package one.digitalinnovaition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PersonTest {

    @Test
    void shouldReturnTrueIfIsAdult() {
        Person person = new Person("Bruno", LocalDateTime.of(1995, 7, 25, 15, 0, 0));
        Assertions.assertTrue(person.isAdult());
    }

    @Test
    void shouldReturnTrueIfCalculationIsCorrect() {
        Person person1 = new Person("Bruno", LocalDateTime.of(1995, 7, 25, 15, 0, 0));
        Assertions.assertEquals(29, person1.getAge());

        Person person2 = new Person("João", LocalDateTime.now());
        Assertions.assertFalse(person2.isAdult());
    }
}
