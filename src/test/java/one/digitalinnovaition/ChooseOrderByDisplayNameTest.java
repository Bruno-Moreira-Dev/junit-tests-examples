package one.digitalinnovaition;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class ChooseOrderByDisplayNameTest {

    @DisplayName("A")
    @Test
    public void validFluxA() {
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    public void validFluxB() {
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    public void validFluxC() {
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    public void validFluxD() {
        Assertions.assertTrue(true);
    }
}
