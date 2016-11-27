package com.risf.plugin;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class Wifi extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("getSSID")) {

            String name = data.getString(0);
            String message = "Trabalhando, " + name;
            callbackContext.success(message);

            return true;

        } else {
            
            return false;

        }
    }
}
