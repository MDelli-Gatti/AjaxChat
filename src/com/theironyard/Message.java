package com.theironyard;

/**
 * Created by michaeldelli-gatti on 6/15/16.
 */
public class Message {
    int id;
    String author;
    String text;

    public Message(int id, String author, String text) {
        this.id = id;
        this.author = author;
        this.text = text;
    }

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
