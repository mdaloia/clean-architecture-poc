package com.ml.tests.cleanarch.usecases.get_shipping_cost.view;

/**
 * This class is responsible for render the data prepared by the presenter.
 */
public class ShippingCostView implements View<ShippingCostViewModel> {

    public void render(ShippingCostViewModel model) {
        String result = String.format(
                "\n###### VIEW - Begin ######\n" +
                        "Hi %s! (Loyalty %s)\n\n" +
                        "For you, the item %s with price: %s\n" +
                        "has this shipping cost: %s" +
                "\n###### VIEW - End ######\n",
                model.getUser(),
                model.getLoyaltyLevel(),
                model.getItem(),
                model.getPrice(),
                model.getShippingCost());

        System.out.println(result);
    }

}
