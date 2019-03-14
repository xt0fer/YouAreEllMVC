package rocks.zipcode.controllers;

import rocks.zipcode.models.Id;
import rocks.zipcode.models.Message;

import java.util.ArrayList;

public interface MessageControllerIface {

    public ArrayList<Message> getMessages();
    public ArrayList<Message> getMessagesForId(Id Id);
    public Message getMessageForSequence(String seq);
    public ArrayList<Message> getMessagesFromFriend(Id myId, Id friendId);

    public Message postMessage(Id myId, Id toId, Message msg);

}
