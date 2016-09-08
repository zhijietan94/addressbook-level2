package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class UtilsTest {

    @Test
    public void null_object_returns_true() {
        String nullObject = null;
        assertTrue(Utils.isAnyNull(nullObject));
    }

    @Test
    public void non_null_object_returns_false() {
        String helloWorld = "Hello World!";
        assertFalse(Utils.isAnyNull(helloWorld));
    }
    
    @Test
    public void unique_elements_returns_true() {
        LinkedList<Integer> listOfNum = new LinkedList<>();
        listOfNum.add(1);
        listOfNum.add(2);
        assertTrue(Utils.elementsAreUnique(listOfNum));
    }
    
    @Test
    public void non_unique_elements_returns_false() {
        LinkedList<Integer> listOfNum = new LinkedList<>();
        listOfNum.add(1);
        listOfNum.add(1);
        assertFalse(Utils.elementsAreUnique(listOfNum));
    }
    
}
