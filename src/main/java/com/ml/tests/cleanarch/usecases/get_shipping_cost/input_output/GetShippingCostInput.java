package com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output;

/**
 * This interface is the contract that clients (e.g. controllers) of the
 * Use Case must know in order to trigger the its execution.
 */
public interface GetShippingCostInput {

    public void calculateShippingCost(GetShippingCostInputModel request);

}
