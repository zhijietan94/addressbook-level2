package seedu.addressbook.ui;

class Formatter {

    public static String addLinePrefixAndLineSeparator(String lineSeparator, String linePrefix, String message){
        return linePrefix + message.replace("\n", lineSeparator + linePrefix);
    }
    
    
}
