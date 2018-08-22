package com.ml.tests.cleanarch.usecases.get_shipping_cost.model;

public class User {

    private Long id;
    private LoyaltyLevel loyaltyLevel;

    public User(Long id, LoyaltyLevel loyaltyLevel) {
        this.id = id;
        this.loyaltyLevel = loyaltyLevel;
    }

    public Long getId() {
        return id;
    }

    public LoyaltyLevel getLoyaltyLevel() {
        return loyaltyLevel;
    }

}
