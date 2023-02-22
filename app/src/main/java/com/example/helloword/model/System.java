package com.example.helloword.model;

public class System {
    private long id;
    private Integer img;
    private String title;
    private String subText;
    private String content;

    public System() {
    }

    public System(long id, Integer img, String title, String subText, String content) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.subText = subText;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
