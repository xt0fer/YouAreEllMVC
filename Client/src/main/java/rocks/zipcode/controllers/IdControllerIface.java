package rocks.zipcode.controllers;

import rocks.zipcode.models.Id;

import java.util.ArrayList;

public interface IdControllerIface {
    public ArrayList<Id> getIds();
    public Id postId(Id id);
    public Id putId(Id id);
}
