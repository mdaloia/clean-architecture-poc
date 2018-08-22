package com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output;

import java.math.BigDecimal;

/**
 * DTO which contains output data with the results of the execution of the Use Case
 */
public class GetShippingCostOutputModel {

    private Long userId;
    private String itemId;
    private String loyaltyLevel;
    private BigDecimal price;
    private BigDecimal shippingCost;

    public GetShippingCostOutputModel(Long userId, String itemId, String loyaltyLevel, BigDecimal price, BigDecimal shippingCost) {
        this.userId = userId;
        this.itemId = itemId;
        this.loyaltyLevel = loyaltyLevel;
        this.price = price;
        this.shippingCost = shippingCost;
    }

    public Long getUserId() {
        return userId;
    }

    public String getItemId() {
        return itemId;
    }

    public String getLoyaltyLevel() {
        return loyaltyLevel;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getShippingCost() {
        return shippingCost;
    }

}
