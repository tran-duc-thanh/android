package com.example.helloword.model;

import android.widget.ImageView;

public class Cat {
    private Long id;
    private int img;
    private String name;
    private String price;
    private String description;

    public Cat() {
    }

    public Cat(Long id, int img, String name) {
        this.id = id;
        this.img = img;
        this.name = name;
    }

    public Cat(Long id, int img, String name, String price, String description) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
