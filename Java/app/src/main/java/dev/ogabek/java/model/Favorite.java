package dev.ogabek.java.model;

public class Favorite {

    private final String title;
    private final int image;

    public Favorite(String title, int image) {
        this.title = title;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
