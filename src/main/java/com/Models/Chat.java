package com.Models;

/**
 * Created by lara on 19/11/15.
 */
public class Chat {
    Integer id;
    String type;
    String title;
    String username;
    String first_name;
    String last_name;

    public Chat(Integer id, String type, String title, String username, String first_name, String last_name) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }
}
