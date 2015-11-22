package com.Models;

/**
 * Created by lara on 19/11/15.
 */
public class PhotoSize {
    String file_id;
    Integer width;
    Integer height;
    Integer file_size;

    public PhotoSize(String file_id, Integer width, Integer height, Integer file_size) {
        this.file_id = file_id;
        this.width = width;
        this.height = height;
        this.file_size = file_size;
    }
}
