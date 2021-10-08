package ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class sortNamesTest {

    @Test
    void sort() {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> sortedNames = new ArrayList<>();
        names.add("Brandon");
        names.add("Chris");
        names.add("Danny");
        names.add("Amanda");
        sortedNames.add("Amanda");
        sortedNames.add("Brandon");
        sortedNames.add("Chris");
        sortedNames.add("Danny");

        assertEquals(sortedNames, sortNames.sort(names));
    }
}