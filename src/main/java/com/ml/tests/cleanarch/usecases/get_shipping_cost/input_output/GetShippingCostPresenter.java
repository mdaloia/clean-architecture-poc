package com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output;

import com.ml.tests.cleanarch.usecases.get_shipping_cost.view.ShippingCostViewModel;
import com.ml.tests.cleanarch.usecases.get_shipping_cost.view.View;

/**
 * This class is responsible for interpret the Use Case response and
 * transform it ready to be rendered by the view and maybe select which
 * view to use for example.
 */
public class GetShippingCostPresenter implements GetShippingCostOutput {

    private View<ShippingCostViewModel> view;

    public GetShippingCostPresenter(View<ShippingCostViewModel> view) {
        this.view = view;
    }

    @Override
    public void provide(GetShippingCostOutputModel response) {
        logInfo(response);

        ShippingCostViewModel model = new ShippingCostViewModel(
                String.format("User %s", response.getUserId()),
                String.format("Level %s", response.getLoyaltyLevel()),
                response.getItemId(),
                String.format("$ %s", response.getPrice()),
                String.format("$ %s", response.getShippingCost())
        );

        view.render(model);
    }

    private void logInfo(GetShippingCostOutputModel response) {
        String result =
                "\nUser: " + response.getUserId() +
                "\nItem: " + response.getItemId() +
                "\nLoyalty: " + response.getLoyaltyLevel() +
                "\nPrice: " + response.getPrice() +
                "\nShipping Cost: " + response.getShippingCost();

        System.out.println(result);
    }

}
