package com.Models;

/**
 * Created by lara on 19/11/15.
 */
public class Contact {
    String phone_number;
    String first_name;
    String last_name;
    Integer user_id;

    public Contact(String phone_number, String first_name, String last_name, Integer user_id) {
        this.phone_number = phone_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_id = user_id;
    }
}
