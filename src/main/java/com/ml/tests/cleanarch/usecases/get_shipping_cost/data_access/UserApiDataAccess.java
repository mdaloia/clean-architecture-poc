package com.ml.tests.cleanarch.usecases.get_shipping_cost.data_access;

import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.LoyaltyLevel;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.User;

/**
 * One of the possible implementations to access to User entities.
 *
 * Any POJO used by the underlying persistence framework must not be
 * exposed to the clients.
 */
public class UserApiDataAccess implements UserDataAccess {

    @Override
    public User getUser(Long userId) {
        Integer level = (userId == 1 ? 2 : 1);

        LoyaltyLevel loyaltyLevel = new LoyaltyLevel(level);

        return new User(userId, loyaltyLevel);
    }

}
