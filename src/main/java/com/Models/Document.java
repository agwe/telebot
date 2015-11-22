package com.Models;

/**
 * Created by lara on 19/11/15.
 */
public class Document {
    String file_id;
    PhotoSize thumb;
    String file_name;
    String mime_type;
    Integer file_size;

    public Document(String file_id, PhotoSize thumb, String file_name, String mime_type, Integer file_size) {
        this.file_id = file_id;
        this.thumb = thumb;
        this.file_name = file_name;
        this.mime_type = mime_type;
        this.file_size = file_size;
    }
}
