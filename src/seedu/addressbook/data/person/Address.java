package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "a/123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Enter Person address in the "
    	+ "following format: a/BLOCK, STREET, UNIT, POSTAL_CODE";
    private static final String ADDRESS_VALIDATION_REGEX = ".+";
    
    private Block blockNumber;
    private Street streetName;
    private Unit unitNumber;
    private PostCode postalCodeNumber;
    
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        createAddress(address);
    }

    private void createAddress(String address) {
        //TODO: Set block, Street, unit, postcode
    }

    /**
     * @return the blockNumber
     */
    private String getBlock() {
	return blockNumber.getBlock();
    }

    /**
     * @return the streetName
     */
    private String getStreet() {
        return streetName.getStreet();
    }

    /**
     * @return the unitNumber
     */
    private String getUnit() {
        return unitNumber.getUnit();
    }

    /**
     * @return the postalCodeNumber
     */
    private String getPostCode() {
        return postalCodeNumber.getPostCode();
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return "" + getBlock() + ", " + getStreet() + ", " + getUnit() + ", " + getPostCode();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.getAddress().equals(((Address) other).getAddress())); // state check
    }

    @Override
    public int hashCode() {
        return getAddress().hashCode();
    }

//    public String getAddress(){
//	return toString();
//    }
    
    /**
     * @return the address formatted by BLOCK, STREET, UNIT, POSTAL_CODE 
     */
    public String getAddress() {
	return this.toString();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}

/**
 * Represents the block number in a Person's address in the address book.
 */
class Block{
    private String _blockNum;
    
    public Block(String blockNum){
	_blockNum = blockNum;
    }
    
    public String getBlock(){
	return _blockNum;
    }
    
}

/**
 * Represents the street name in a Person's address in the address book.
 */
class Street{
    private String _street;
    
    public Street(String street){
	_street = street;
    }
    
    public String getStreet(){
	return _street;
    }
    
}

/**
 * Represents the unit number in a Person's address in the address book.
 */
class Unit{
    private String _unitNum;
    
    public Unit(String unitNum){
	_unitNum = unitNum;
    }
    
    public String getUnit(){
	return _unitNum;
    }
    
}

/**
 * Represents the postal code in a Person's address in the address book.
 */
class PostCode{
private String _postalNum;
    
    public PostCode(String postalNum){
	_postalNum = postalNum;
    }
    
    public String getPostCode(){
	return _postalNum;
    }
    
}

