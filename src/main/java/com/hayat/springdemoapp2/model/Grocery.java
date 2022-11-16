package com.hayat.springdemoapp2.model;

/**
 * @author Abrar Hayat
 * @since November 2022
 **/
public class Grocery {
    public Grocery(String title, String type, String filename, String height, String width, String price, String rating) {
        this.title = title;
        this.type = type;
        this.filename = filename;
        this.height = height;
        this.width = width;
        this.price = price;
        this.rating = rating;
    }

    private String title;
    private String type;
    private String filename;
    private  String height;
    private String width;
    private String price;

    private String rating;

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getFilename() {
        return filename;
    }

    public String getHeight() {
        return height;
    }

    public String getWidth() {
        return width;
    }

    public String getPrice() {
        return price;
    }

    public String getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Grocery{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", filename='" + filename + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                ", price='" + price + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
