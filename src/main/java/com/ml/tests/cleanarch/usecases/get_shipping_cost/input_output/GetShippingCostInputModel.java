package com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output;

/**
 * DTO which contains input data for the execution of the Use Case
 */
public class GetShippingCostInputModel {

    private Long userId;
    private String itemId;

    public GetShippingCostInputModel(Long userId, String itemId) {
        this.userId = userId;
        this.itemId = itemId;
    }

    public Long getUserId() {
        return userId;
    }

    public String getItemId() {
        return itemId;
    }

}
