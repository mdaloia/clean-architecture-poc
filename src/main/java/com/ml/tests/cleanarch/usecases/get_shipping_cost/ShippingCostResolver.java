package com.ml.tests.cleanarch.usecases.get_shipping_cost;

import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.Item;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.ShippingCost;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.User;

import java.math.BigDecimal;

/**
 * This class implements the "real" business logic of the use case.
 */
public class ShippingCostResolver {

    public ShippingCost getCost(User user, Item item) {
        int cost;

        if (user.getLoyaltyLevel().getLevel() >= 2
                && item.getPrice().getValue().compareTo(new BigDecimal(1200)) >= 1) {
            cost = 0;
        } else {
            cost = 150;
        }

        return new ShippingCost(new BigDecimal(cost));
    }

}
