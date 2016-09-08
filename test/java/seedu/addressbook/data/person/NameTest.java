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

    @Test
    public void same_name_same_case_returns_true() throws IllegalValueException {
        assertTrue(name.isSimilar(new Name("John K Smith")));
    }
    
    @Test
    public void same_name_diff_case_returns_true() throws IllegalValueException {
        assertTrue(name.isSimilar(new Name("john k smith")));
    }

}
