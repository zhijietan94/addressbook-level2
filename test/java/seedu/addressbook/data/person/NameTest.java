package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {

    private Name name;
    
    @Before
    public void setUp() throws IllegalValueException{
        name = new Name("John K Smith");
    }

    
    //Testing of isSimilar method
    @Test
    public void same_name_same_case_returns_true() throws IllegalValueException {
        assertTrue(name.isSimilar(new Name("John K Smith")));
    }
    
    @Test
    public void same_name_diff_case_returns_true() throws IllegalValueException {
        assertTrue(name.isSimilar(new Name("john k smith")));
    }
    
    @Test
    public void null_name_object_returns_false() throws IllegalValueException {
        Name nullName = null; 
        assertFalse(name.isSimilar(nullName));
    }
    
    @Test (expected= NullPointerException.class)
    public void null_name_string_throws_exception() throws IllegalValueException {
        String nullString = null; 
        name.isSimilar(new Name(nullString));
    }
    
    @Test
    public void name_is_subset_superset_returns_true() throws IllegalValueException {
        assertTrue(name.isSimilar(new Name("John Smith")));
        assertTrue(name.isSimilar(new Name("John K A Smith")));
        assertFalse(name.isSimilar(new Name("John A Smith")));
    }
    
    //End of testing of isSimilar method
}
