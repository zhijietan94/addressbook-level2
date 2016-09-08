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
    
    @Test (expected= IllegalValueException.class)
    public void name_string_with_comma_throws_exception() throws IllegalValueException {
        name.isSimilar(new Name("John, Smith"));
    }
    
    @Test
    public void name_is_subset_superset_returns_true() throws IllegalValueException {
        //Other name is a subset
        assertTrue(name.isSimilar(new Name("John Smith")));
        //Other name is a subset in different ordering
        assertTrue(name.isSimilar(new Name("Smith K"))); 
        
        //Other name is a superset
        assertTrue(name.isSimilar(new Name("John K A Smith")));
        //Other name is a superset in a different ordering
        assertTrue(name.isSimilar(new Name("Smith K John A")));     
    }
    
    @Test
    public void diff_name_returns_false() throws IllegalValueException {
        assertFalse(name.isSimilar(new Name("John A Smith")));
    }
    
    //End of testing of isSimilar method
}
