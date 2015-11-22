package com.Models;

/**
 * Created by lara on 19/11/15.
 */
public class Voice {
    String file_id;
    Integer duration;
    String mime_type;
    Integer file_size;

    public Voice(String file_id, Integer duration, String mime_type, Integer file_size) {
        this.file_id = file_id;
        this.duration = duration;
        this.mime_type = mime_type;
        this.file_size = file_size;
    }
}
