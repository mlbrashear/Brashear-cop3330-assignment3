package ex46;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class occurrencesTest {

    @Test
    void count() {
        ArrayList<String> list = new ArrayList<String>();
        String badger = "badger";
        list.add("badger");
        list.add("badger");
        list.add("badger");
        list.add("badger");
        list.add("mushroom");
        list.add("mushroom");
        list.add("snake");
        list.add("badger");
        list.add("badger");
        list.add("badger");

        assertEquals(7, occurrences.count(list, badger));
    }
}