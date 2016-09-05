package seedu.addressbook.data;

import java.util.ArrayList;

public class Tagging {
    
    private static ArrayList<String> listOfTaggings;
    
    private boolean _isAdd;
    private String _personName;
    private String _tagName;
    
    public Tagging(boolean isAdd, String personName, String tagName){
        _isAdd = isAdd;
        _personName = personName;
        _tagName = tagName;
        listOfTaggings.add(this.toString());
    }
    
    @Override
    public String toString(){
        return (_isAdd)?"+":"-" + " " + _personName + " [" + _tagName + "]";
    }
    
    /**
     * Returns the ArrayList of taggings.
     */
    public static ArrayList<String> getListOfTags(){
        return listOfTaggings;
    }
    
}
