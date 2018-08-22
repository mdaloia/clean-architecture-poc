package com.ml.tests.cleanarch.usecases.get_shipping_cost.view;

/**
 * DTO which contains the data to be used and rendered in the view.
 *
 * It must contain strings (ready to be rendered) and booleans for
 * simple blocks activation/deactivation
 */
public class ShippingCostViewModel {

    private String user;
    private String loyaltyLevel;
    private String item;
    private String price;
    private String shippingCost;

    public ShippingCostViewModel(String user, String loyaltyLevel, String item, String price, String shippingCost) {
        this.user = user;
        this.item = item;
        this.loyaltyLevel = loyaltyLevel;
        this.price = price;
        this.shippingCost = shippingCost;
    }

    public String getUser() {
        return user;
    }

    public String getLoyaltyLevel() {
        return loyaltyLevel;
    }

    public String getItem() {
        return item;
    }

    public String getPrice() {
        return price;
    }

    public String getShippingCost() {
        return shippingCost;
    }

}
