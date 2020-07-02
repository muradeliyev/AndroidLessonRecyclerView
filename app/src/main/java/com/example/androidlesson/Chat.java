package com.example.androidlesson;

public class Chat {

    private String imageUrl;
    private String name;
    private String description;

    public Chat(String imageUrl, String name, String description) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}