package com.Models;

/**
 * Created by lara on 19/11/15.
 */
public class Update {
    Integer update_id;
    Message message;

    public Update(Integer update_id, Message message) {
        this.update_id = update_id;
        this.message = message;
    }

    public Integer getUpdate_id() {
        return update_id;
    }

    public void setUpdate_id(Integer update_id) {
        this.update_id = update_id;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
