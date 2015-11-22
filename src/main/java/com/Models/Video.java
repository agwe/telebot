package com.Models;

/**
 * Created by lara on 19/11/15.
 */
public class Video {
    String file_id;
    Integer width;
    Integer height;
    Integer duration;
    PhotoSize thumb;
    String mime_type;
    Integer file_size;

    public Video(String file_id, Integer width, Integer height, Integer duration, PhotoSize thumb, String mime_type, Integer file_size) {
        this.file_id = file_id;
        this.width = width;
        this.height = height;
        this.duration = duration;
        this.thumb = thumb;
        this.mime_type = mime_type;
        this.file_size = file_size;
    }
}
