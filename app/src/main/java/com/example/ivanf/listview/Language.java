package com.example.ivanf.listview;

/**
 * Created by Ivanf on 2017/6/1.
 */

public class Language {
    private String name;
    private int imageId;
    private String content;

    public Language(String name,int imageId,String content) {
        this.name = name;
        this.imageId = imageId;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public String getContent() {
        return content;
    }
}





