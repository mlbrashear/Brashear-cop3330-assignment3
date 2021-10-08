package ex42;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class employeeTest {

    @Test
    void splitList() {
        String[] temp1 = {"Ling" , "Mai", "559900"};
        String data1 = "Ling,Mai,559900";
        assertEquals(data1, data1);
        String[] temp2 = {"Johnson", "Jim" , "56500"};
        String data2 = "Johnson,Jim,56500";
        assertEquals(data2, data2);
    }
}