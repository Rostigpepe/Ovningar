package Övningsuppgift8OOPTest;

import org.junit.jupiter.api.Test;
import Övningsuppgift8OOP.Reader;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {
    ArrayList<String> list = Reader.temperatures();

    @Test
    void temperatures(){
        assertTrue(list.size() > 0);
        for (String s : list) {
            assertNotNull(s);
        }
    }

    @Test
    void sortList(){
        ArrayList<Double> doubleList = Reader.sortList(list);
        int size = doubleList.size() - 1;

        for (int i = 0; i < size + 1; i++) {
            System.out.println(doubleList.get(i));
        }

        assertTrue(doubleList.get(0) >= doubleList.get(1));
        assertTrue(doubleList.get(size) <= doubleList.get(size - 1));
        assertNotSame(doubleList.get(size), doubleList.get(size - 5));
        assertNotSame(doubleList.get(3), doubleList.get(size));

    }


}
