package rocks.zipcode.views;

import rocks.zipcode.models.Id;

public class IdTextView {

    // You could implment this...

    public IdTextView(Id idToDisplay) {}
    @Override public String toString() {
        return null;
    }

    // Or you could implement this...

    public static String idToString(Id idToFormat) { return ""; }
}