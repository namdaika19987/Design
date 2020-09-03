package com.example.design;

public class SliderItem {

    private String description;
    private int imageUrl;

    public SliderItem(String description, int imageUrl) {
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public SliderItem() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }
}
