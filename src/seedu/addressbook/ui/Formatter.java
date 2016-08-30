package seedu.addressbook.ui;

import java.util.List;

class Formatter {

    public static String addLinePrefixAndLineSeparator(String lineSeparator, String linePrefix, String message){
        return linePrefix + message.replace("\n", lineSeparator + linePrefix);
    }

    public static String addIndexToList(List<String> listItems, int displayedIndexOffset, String messageIndexedListItem) {
      final StringBuilder formatted = new StringBuilder();
      int displayIndex = 0 + displayedIndexOffset;
      for (String listItem : listItems) {
          formatted.append(getIndexedListItem(displayIndex, listItem, messageIndexedListItem)).append("\n");
          displayIndex++;
      }
      return formatted.toString();
    }
    
    /**
     * Formats a string as a viewable indexed list item.
     *
     * @param visibleIndex visible index for this listing
     */
    private static String getIndexedListItem(int visibleIndex, String listItem, String messageIndexedListItem) {
        return String.format(messageIndexedListItem, visibleIndex, listItem);
    }
    
}
