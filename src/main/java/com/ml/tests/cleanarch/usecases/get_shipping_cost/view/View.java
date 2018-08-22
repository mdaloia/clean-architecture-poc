package com.ml.tests.cleanarch.usecases.get_shipping_cost.view;

/**
 * This interface serves mostly to invert the direction of the dependency
 * between the Presenter and the View.
 */
public interface View<T> {

    public void render(T model);

}
