package com.example.joker.mili;

import android.graphics.drawable.Drawable;

/**
 * Created by Joker on 2/19/2020.
 */

public class Post {

    private int id;
    private Drawable post_img;
    private String title;
    private String text;
    private String time;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Drawable getPost_img() {
        return post_img;
    }

    public void setPost_img(Drawable post_img) {
        this.post_img = post_img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }


}
