package rocks.zipcode.controllers;

import org.json.JSONObject;

// you'll need to make a concrete class for make these calls.

interface WebTransactions {
    String rootURL = "http://zipcode.rocks:8085";

    JSONObject get(String urlFragment);
    JSONObject post(String urlFragment, JSONObject payload);
    JSONObject put(String urlFragment);

}

