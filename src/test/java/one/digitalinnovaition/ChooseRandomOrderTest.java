package one.digitalinnovaition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.Random.class)
public class ChooseRandomOrderTest {

    @Test
    public void validFluxA() {
        Assertions.assertTrue(true);
    }

    @Test
    public void validFluxB() {
        Assertions.assertTrue(true);
    }

    @Test
    public void validFluxC() {
        Assertions.assertTrue(true);
    }

    @Test
    public void validFluxD() {
        Assertions.assertTrue(true);
    }
}
