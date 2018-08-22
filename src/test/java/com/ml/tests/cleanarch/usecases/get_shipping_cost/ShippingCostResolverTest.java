package com.ml.tests.cleanarch.usecases.get_shipping_cost;

import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.Item;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.LoyaltyLevel;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.Price;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.ShippingCost;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.User;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class ShippingCostResolverTest {

    @Test
    public void shipping_cost_NOT_free_when_loyalty_level_two_and_price_lower_than_1200() {
        // Given
        LoyaltyLevel loyaltyLevel = new LoyaltyLevel(2);
        User user = new User(1L, loyaltyLevel);

        Price price = new Price(new BigDecimal(500));
        Item item = new Item("MLA1", price);

        ShippingCostResolver resolver = new ShippingCostResolver();

        // When
        ShippingCost shippingCost = resolver.getCost(user, item);

        // Then
        Assert.assertNotEquals("It should not be free", BigDecimal.ZERO, shippingCost.getCost());
        Assert.assertTrue("The cost should be positive", shippingCost.getCost().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    public void shipping_cost_free_when_loyalty_level_two_and_price_higher_than_1200() {
        // Given
        LoyaltyLevel loyaltyLevel = new LoyaltyLevel(2);
        User user = new User(1L, loyaltyLevel);

        Price price = new Price(new BigDecimal(1400));
        Item item = new Item("MLA1", price);

        ShippingCostResolver resolver = new ShippingCostResolver();

        // When
        ShippingCost shippingCost = resolver.getCost(user, item);

        // Then
        Assert.assertEquals("It should be free", BigDecimal.ZERO, shippingCost.getCost());
    }

    @Test
    public void shipping_cost_NOT_free_when_loyalty_level_one_and_price_higher_than_1200() {
        // Given
        LoyaltyLevel loyaltyLevel = new LoyaltyLevel(1);
        User user = new User(1L, loyaltyLevel);

        Price price = new Price(new BigDecimal(1400));
        Item item = new Item("MLA1", price);

        ShippingCostResolver resolver = new ShippingCostResolver();

        // When
        ShippingCost shippingCost = resolver.getCost(user, item);

        // Then
        Assert.assertNotEquals("It should not be free", BigDecimal.ZERO, shippingCost.getCost());
        Assert.assertTrue("The cost should be positive", shippingCost.getCost().compareTo(BigDecimal.ZERO) > 0);
    }

}
