package com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetShippingCostController {

    private GetShippingCostInput input;

    public GetShippingCostController(GetShippingCostInput input) {
        this.input = input;
    }

    public void handle(HttpServletRequest request, HttpServletResponse response) {
        validateParams(request);

        Long userId = new Long(request.getParameter("userId"));
        String itemId = request.getParameter("itemId");

        GetShippingCostInputModel inputModel = new GetShippingCostInputModel(userId, itemId);

        input.calculateShippingCost(inputModel);
    }

    private void validateParams(HttpServletRequest request) {
        // Perform necessary validations over params
    }

}
