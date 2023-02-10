package com.example.demoweb.model;

public class Post {
    private String text;
    private String likes = "0";

    public Post(String text) {
        this.text = text;
    }

    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public String getLikes(){
        return likes;
    }

}
