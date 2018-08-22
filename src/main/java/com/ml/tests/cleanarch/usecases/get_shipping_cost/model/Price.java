package com.ml.tests.cleanarch.usecases.get_shipping_cost.model;

import java.math.BigDecimal;

public class Price {

    private BigDecimal value;

    public Price(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }

}
