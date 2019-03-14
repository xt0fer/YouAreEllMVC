package rocks.zipcode.controllers;

import java.util.ArrayList;
import java.util.HashSet;

import rocks.zipcode.models.Id;
import rocks.zipcode.models.Message;

public class MessageController implements MessageControllerIface {

    private HashSet<Message> messagesSeen;
    // why a HashSet?? and what will the key be?

    // notice the dependency injection here.

    public MessageController(WebTransactions wt) {}

    public ArrayList<Message> getMessages() {
        return null;
    }
    public ArrayList<Message> getMessagesForId(Id Id) {
        return null;
    }
    public Message getMessageForSequence(String seq) {
        return null;
    }
    public ArrayList<Message> getMessagesFromFriend(Id myId, Id friendId) {
        return null;
    }

    public Message postMessage(Id myId, Id toId, Message msg) {
        return null;
    }
 
}