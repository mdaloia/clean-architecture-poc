package com.ml.tests.cleanarch.usecases.get_shipping_cost.data_access;

import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.Item;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.Price;

import java.math.BigDecimal;

/**
 * One of the possible implementations to access to Item entities.
 *
 * Any POJO used by the underlying persistence framework must not be
 * exposed to the clients.
 */
public class ItemApiDataAccess implements ItemDataAccess {

    @Override
    public Item getItem(String itemId) {
        Integer priceValue = ("MLA123".equals(itemId) ? 1500 : 500);

        Price price = new Price(new BigDecimal(priceValue));

        return new Item(itemId, price);
    }

}
