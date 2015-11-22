package com.Models;

/**
 * Created by lara on 19/11/15.
 */
public class ResponseGetMe {

    private final boolean ok;
    private final User result;

    public ResponseGetMe(boolean ok, User result) {
        this.ok = ok;
        this.result = result;
    }

    public boolean isOk() {
        return ok;
    }

    public User getResult() {
        return result;
    }
}
