package dev.ogabek.java.model;

public class TodaysDeals {

    private final int picture;
    private final String name;
    private final String currentPrice;
    private String lastPrice;
    private final String discount;

    public TodaysDeals(int picture, String name, Double currentPrice, Double lastPrice, Double discount) {
        this.picture = picture;
        this.name = name;
        this.currentPrice = "$" + currentPrice;
        this.discount = discount + "%";
        this.lastPrice = "$" + lastPrice;
    }

    public String getName() {
        return name;
    }

    public int getPicture() {
        return picture;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public String getDiscount() {
        return discount;
    }

    public String getLastPrice() {
        return lastPrice;
    }
}
