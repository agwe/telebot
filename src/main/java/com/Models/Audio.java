package com.Models;

/**
 * Created by lara on 19/11/15.
 */
public class Audio {
    String file_id;
    Integer duration;
    String performer;
    String title;
    String mime_type;
    Integer file_size;

    public Audio(String file_id, Integer duration, String performer, String title, String mime_type, Integer file_size) {
        this.file_id = file_id;
        this.duration = duration;
        this.performer = performer;
        this.title = title;
        this.mime_type = mime_type;
        this.file_size = file_size;
    }
}
