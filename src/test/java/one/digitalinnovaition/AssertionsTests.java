package one.digitalinnovaition;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionsTests {

    @Test
    void validArrays() {
        int[] array1 = {10, 20, 30};
        int[] array2 = {10, 20, 30};

        assertArrayEquals(array1, array2);
    }

    @Test
    void validIfObjectIsNull() {
        Person person = null;
        assertNull(person);

        person = new Person("Bruno", LocalDateTime.now());
        assertNotNull(person);
    }

    @Test
    void validTypeNumber() {
        double value1 = 5.0;
        double value2 = 5.0;

        assertEquals(value1, value2);
    }
}
