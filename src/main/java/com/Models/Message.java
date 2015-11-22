package com.Models;

import java.util.List;

/**
 * Created by lara on 19/11/15.
 */
public class Message {
    Integer message_id;
    User from;
    Integer	date;
    Chat chat;
    User forward_from;
    Integer forward_date;
    Message reply_to_message;
    String text;
    Audio audio;
    Document document;
    List<PhotoSize> photo;
    Sticker sticker;
    Video video;
    Voice voice;
    String caption;
    Contact contact;
    Location location;
    User new_chat_participant;
    User left_chat_participant;
    String new_chat_title;
    List<PhotoSize> new_chat_photo;
    Boolean delete_chat_photo = true;
    Boolean group_chat_created =true;

    public Message(Integer message_id, User from, Integer date, Chat chat, User forward_from, Integer forward_date, Message reply_to_message, String text, Audio audio, Document document, List<PhotoSize> photo, Sticker sticker, Video video, Voice voice, String caption, Contact contact, Location location, User new_chat_participant, User left_chat_participant, String new_chat_title, List<PhotoSize> new_chat_photo, Boolean delete_chat_photo, Boolean group_chat_created) {
        this.message_id = message_id;
        this.from = from;
        this.date = date;
        this.chat = chat;
        this.forward_from = forward_from;
        this.forward_date = forward_date;
        this.reply_to_message = reply_to_message;
        this.text = text;
        this.audio = audio;
        this.document = document;
        this.photo = photo;
        this.sticker = sticker;
        this.video = video;
        this.voice = voice;
        this.caption = caption;
        this.contact = contact;
        this.location = location;
        this.new_chat_participant = new_chat_participant;
        this.left_chat_participant = left_chat_participant;
        this.new_chat_title = new_chat_title;
        this.new_chat_photo = new_chat_photo;
        this.delete_chat_photo = delete_chat_photo;
        this.group_chat_created = group_chat_created;
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public User getFrom() {
        return from;
    }

    public Integer getDate() {
        return date;
    }

    public Chat getChat() {
        return chat;
    }

    public User getForward_from() {
        return forward_from;
    }

    public Integer getForward_date() {
        return forward_date;
    }

    public Message getReply_to_message() {
        return reply_to_message;
    }

    public String getText() {
        return text;
    }

    public Audio getAudio() {
        return audio;
    }

    public Document getDocument() {
        return document;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Video getVideo() {
        return video;
    }

    public Voice getVoice() {
        return voice;
    }

    public String getCaption() {
        return caption;
    }

    public Contact getContact() {
        return contact;
    }

    public Location getLocation() {
        return location;
    }

    public User getNew_chat_participant() {
        return new_chat_participant;
    }

    public User getLeft_chat_participant() {
        return left_chat_participant;
    }

    public String getNew_chat_title() {
        return new_chat_title;
    }

    public List<PhotoSize> getNew_chat_photo() {
        return new_chat_photo;
    }

    public Boolean getDelete_chat_photo() {
        return delete_chat_photo;
    }

    public Boolean getGroup_chat_created() {
        return group_chat_created;
    }
}
