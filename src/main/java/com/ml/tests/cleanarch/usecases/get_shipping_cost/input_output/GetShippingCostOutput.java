package com.ml.tests.cleanarch.usecases.get_shipping_cost.input_output;

/**
 * This interface is the contract that the Use Case expose to
 * interest "listeners" (e.g. presenters) must know in order to
 * get the result of the Use Case execution.
 */
public interface GetShippingCostOutput {

    public void provide(GetShippingCostOutputModel response);

}
