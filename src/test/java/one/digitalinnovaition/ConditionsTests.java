package one.digitalinnovaition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionsTests {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Bruno")
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    @EnabledOnOs({OS.MAC, OS.WINDOWS})
    @EnabledOnJre(JRE.JAVA_8)
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    public void validSomethingInUser() {
        Assumptions.assumeTrue("Bruno".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
