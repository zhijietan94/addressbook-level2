package seedu.addressbook.data.person;

public class Contact {
    
    public String value;
    protected boolean isPrivate;
    
    
    /**
     * Checks if a given string is a valid person contact based the
     * respective regex.
     */
    public boolean isValidContact(String test, String regex){
        return test.matches(regex);
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }

    /**
     * Checks if this contact is private.
     */
    public boolean isPrivate() {
        return isPrivate;
    }
    
}
