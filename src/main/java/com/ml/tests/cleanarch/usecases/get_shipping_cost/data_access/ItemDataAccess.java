package com.ml.tests.cleanarch.usecases.get_shipping_cost.data_access;

import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.Item;

/**
 * Interface to access to Item entities.
 *
 * It must not expose any DTO used by the underlying persistence framework
 */
public interface ItemDataAccess {

    public Item getItem(String itemId);

}
