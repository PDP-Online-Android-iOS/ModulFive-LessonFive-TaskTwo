package dev.ogabek.java.model;

public class Category {

    private final int picture;
    private final String title;

    public Category(String title, int picture) {
        this.picture = picture;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getPicture() {
        return picture;
    }
}
