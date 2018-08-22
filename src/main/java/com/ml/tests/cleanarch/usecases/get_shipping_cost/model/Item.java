package com.ml.tests.cleanarch.usecases.get_shipping_cost.model;

public class Item {

    private String id;
    private Price price;
    private String description;

    public Item(String id, Price price) {
        this.id = id;
        this.price = price;
    }

    public Item(String id, Price price, String description) {
        this(id, price);
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public Price getPrice() {
        return price;
    }

}
