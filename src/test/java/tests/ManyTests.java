package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("form")
public class ManyTests {

    @Test
    void firstTest() {
        Assertions.assertTrue(true);
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(true);
    }

    @Test
    void thirdTest() {
        Assertions.assertTrue(true);
    }

    @Test
    void fourthTest() {
        Assertions.assertTrue(true);
    }

    @Test
    void fifthTest() {
        Assertions.assertTrue(true);
    }

    @Disabled
    @Test
    void sixthTest() {
        Assertions.assertTrue(true);
    }

}
