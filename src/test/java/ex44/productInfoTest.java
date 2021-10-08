package ex44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProductsTest {

    @Test
    void checkString() {
        ArrayList<String> array = new ArrayList<>();
        array.add("Aatrox, Blitzcrank, Caitlyn");
        array.add("Darius, Ezeral, Fiddlesticks");
        array.add("Gragas, Heimerdinger, Ivern");
        assertEquals(0, productInfo.check(array, "Aatrox"));
        assertEquals(-1, productInfo.check(array, "Lulu"));
    }

}