package com.example.myapplication;

public class Event {
    private int photoResId;
    private String title;

    public Event(int photoResId, String title) {
        this.photoResId = photoResId;
        this.title = title;
    }

    public int getPhotoResId() {
        return photoResId;
    }

    public String getTitle() {
        return title;
    }
}
