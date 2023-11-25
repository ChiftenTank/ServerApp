package com.example.joker.mili;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by Joker on 6/13/2020.
 */

public class post_view1 {

    private int id;
    private Drawable post_img;
    private Drawable post_img_like;
    private Drawable post_img_chat;
    private Drawable post_img_seen;
    private String title;
    private String content;
    private String time;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getPost_img() {
        return post_img;
    }

    public void setPost_img(Drawable post_img) {
        this.post_img = post_img;
    }

    public Drawable getPost_img_like() {
        return post_img_like;
    }

    public void setPost_img_like(Drawable post_img_like) {
        this.post_img_like = post_img_like;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Drawable getPost_img_chat() {
        return post_img_chat;
    }

    public void setPost_img_chat(Drawable post_img_chat) {
        this.post_img_chat = post_img_chat;
    }


    public Drawable getPost_img_seen() {
        return post_img_seen;
    }

    public void setPost_img_seen(Drawable post_img_seen) {
        this.post_img_seen = post_img_seen;
    }
}

