package rocks.zipcode.controllers;

import org.json.JSONObject;

// this is the concrete class where talking to the server is implemented.

public class WebTransactionsImpl implements WebTransactions {

    // probably need instance vars to manage the
    // ongoing http connection to the server

    public JSONObject get(String urlFragment) {
        return null;
    }

    public JSONObject post(String urlFragment, JSONObject payload) {
        return null;
    }

    public JSONObject put(String urlFragment) {
        return null;
    }
}
