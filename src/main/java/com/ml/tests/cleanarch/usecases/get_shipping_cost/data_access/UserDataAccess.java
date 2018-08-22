package com.ml.tests.cleanarch.usecases.get_shipping_cost.data_access;

import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.User;

/**
 * Interface to access to User entities.
 *
 * It must not expose any DTO used by the underlying persistence framework
 */
public interface UserDataAccess {

    public User getUser(Long userId);

}
