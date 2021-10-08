package ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class compareUseUtilizeTest {

    @Test
    void useUtilize() {
        String utilize = "utilize", utilizes = "utilizes", quoteUtilize = "\"utilize\"";

        assertEquals(1, compareUseUtilize.useUtilize(utilize));
        assertEquals(2, compareUseUtilize.useUtilize(utilizes));
        assertEquals(3, compareUseUtilize.useUtilize(quoteUtilize));
        assertEquals(0, compareUseUtilize.useUtilize("pizza"));
    }
}