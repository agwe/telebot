package com.Models;

import java.util.List;

/**
 * Created by lara on 19/11/15.
 */

public class ResponseGetUpdates {
    String ok;
    List<Update> result;


    public ResponseGetUpdates(String ok, List<Update> result) {
        this.ok = ok;
        this.result = result;
    }

    public String getOk() {
        return ok;
    }

    public List<Update> getResult() {
        return result;
    }
}
