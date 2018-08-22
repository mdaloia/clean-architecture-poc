package com.ml.tests.cleanarch.usecases.get_shipping_cost;

import com.ml.tests.cleanarch.usecases.get_shipping_cost.data_access.ItemDataAccess;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.data_access.UserDataAccess;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output.GetShippingCostInput;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output.GetShippingCostInputModel;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output.GetShippingCostOutput;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output.GetShippingCostOutputModel;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.Item;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.ShippingCost;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.model.User;

/**
 * This class acts as an entry point to the use case.
 *
 * It transform the input data in entities to be used by the business
 * logic of the use case and when it has the execution results transform
 * it into a output DTO.
 *
 * It is worth to note that the Use Case can be composed of several classes
 * to be able to resolve it.
 */
public class ShippingCostInteractor implements GetShippingCostInput {

    private UserDataAccess userDataAccess;
    private ItemDataAccess itemDataAccess;

    private ShippingCostResolver resolver;

    private GetShippingCostOutput output;

    public ShippingCostInteractor(
            UserDataAccess userDataAccess,
            ItemDataAccess itemDataAccess,
            ShippingCostResolver resolver,
            GetShippingCostOutput output
    ) {
        this.userDataAccess = userDataAccess;
        this.itemDataAccess = itemDataAccess;
        this.resolver = resolver;
        this.output = output;
    }

    @Override
    public void calculateShippingCost(GetShippingCostInputModel request) {
        User user = userDataAccess.getUser(request.getUserId());
        Item item = itemDataAccess.getItem(request.getItemId());

        ShippingCost shippingCost = resolver.getCost(user, item);

        GetShippingCostOutputModel outputModel = new GetShippingCostOutputModel(
                user.getId(),
                item.getId(),
                user.getLoyaltyLevel().getLevel().toString(),
                item.getPrice().getValue(),
                shippingCost.getCost()
        );

        output.provide(outputModel);
    }

}
