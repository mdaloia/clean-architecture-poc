package com.ml.tests.cleanarch.usecases.get_shipping_cost.model;

import java.math.BigDecimal;

public class ShippingCost {

    private BigDecimal cost;

    public ShippingCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getCost() {
        return cost;
    }

}
