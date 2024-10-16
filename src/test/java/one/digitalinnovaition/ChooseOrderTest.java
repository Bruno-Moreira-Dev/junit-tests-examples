package one.digitalinnovaition;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ChooseOrderTest {

    @Order(4)
    @Test
    public void validFluxA() {
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    public void validFluxB() {
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    public void validFluxC() {
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    public void validFluxD() {
        Assertions.assertTrue(true);
    }
}
