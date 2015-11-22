package com.Models;

/**
 * Created by lara on 19/11/15.
 */
public class Sticker {
    String file_id;
    Integer width;
    Integer height;
    PhotoSize thumb;
    Integer file_size;

    public Sticker(String file_id, Integer width, Integer height, PhotoSize thumb, Integer file_size) {
        this.file_id = file_id;
        this.width = width;
        this.height = height;
        this.thumb = thumb;
        this.file_size = file_size;
    }
}
