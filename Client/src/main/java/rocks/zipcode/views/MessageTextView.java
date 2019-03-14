package rocks.zipcode.views;

import rocks.zipcode.models.Message;

public class MessageTextView {

    // You could implment this...

    public MessageTextView(Message idToDisplay) {}
    @Override public String toString() {
        return null;
    }

    // Or you could implement this...

    public static String msgToString(Message mgToFormat) { return ""; }

}